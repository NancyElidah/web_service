create table role(
    id int primary key,
    role varchar(25) unique
);

create table utilisateur (
    id varchar(07) primary key,
    nom varchar(50) not null,
    prenom varchar(150),
    pseudo varchar(50),
    email varchar(100) unique not null,
    mot_de_passe varchar(50) not null,
    genre int,
    id_role int references role(id)
);

create table type_artiste (
    id serial primary key,
    intitule varchar(50) unique
);

create table utilisateur_type_artiste (
    id serial primary key,
    id_utilisateur varchar(07),
    id_type_artiste int references type_artiste(id),
    bio varchar(255)
);

-- style solon'ilay sous categorie
create table style ( 
    id serial primary key,  
    style varchar(50),
    id_type_artiste int references type_artiste(id)
);

create table type_description (
    id serial primary key,
    id_type_artiste int references type_artiste(id),
    description varchar(25),
    type varchar(10)
);

create table collection (
    id varchar(07) primary key,
    id_utilisateur varchar(07) references utilisateur(id),
    titre varchar(50) not null,
    date_creation date not null,
    id_style int references style(id),
    contexte_historique varchar(300),
    message varchar(300),
    status int default 0,
    etat int default 0,
    date_publication timestamp,
    couleur varchar(20)
);

create table description (
    id serial primary key,
    id_collection varchar(07) references collection(id),
    id_type_description int references type_description(id),
    description varchar(255)
);

create table commentaire (
    id serial primary key,
    id_collection varchar(07) references collection(id),
    id_utilisateur varchar(07) references utilisateur(id),
    commentaire varchar(255) not null,
    type int default 0
); 

create table favorie (
    id serial primary key,
    id_collection varchar(07) references collection(id),
    id_utilisateur varchar(07) references utilisateur(id),
    etat int default 0
);

create table note (
    id serial primary key,
    id_collection varchar(07) references collection(id),
    id_utilisateur varchar(07) references utilisateur(id),
    note int default 0
);

create table exposition (
    id varchar(07) primary key,
    id_utilisateur varchar(07) references utilisateur(id),
    prix double precision default 0,
    date_debut timestamp,
    date_fin timestamp,
    description varchar(300)
);

create table collection_exposition (
    id serial primary key,
    id_exposition varchar(07) references exposition(id),
    id_collection varchar(07) references collection(id)
);

create table utilisateur_exposition (
    id serial primary key,
    id_exposition varchar(07) references exposition(id),
    id_utilisateur varchar(07) references utilisateur(id),
    date_achat DATE 
);

create sequence seq_utilisateur start with 1 increment by 1;
create sequence seq_collection start with 1 increment by 1;
create sequence seq_exposition start with 1 increment by 1;



-- les utilisateurs artistes
CREATE OR REPLACE VIEW v_artistes AS (
    SELECT u.*
    FROM utilisateur u 
    WHERE u.id_role = 10  
);

-- pour prendre les informations des artistes
CREATE OR REPLACE VIEW v_artiste_information AS (
    SELECT u.* , type_u.bio , type_a.id id_type_artiste , type_a.intitule
    FROM v_artistes u 
    JOIN utilisateur_type_artiste type_u ON u.id = type_u.id_utilisateur
    JOIN type_artiste type_a ON type_a.id = type_u.id_type_artiste
); 

CREATE OR REPLACE VIEW v_note_artiste AS (
    SELECT u.id , s.id_type_artiste ,ROUND(AVG(n.note)) note , Count(c.id)nombre_element
    FROM note n 
    JOIN collection c ON c.id = n.id_collection
    JOIN v_artistes u ON u.id = c.id_utilisateur
    JOIN style s ON s.id= c.id_style 
    JOIN type_artiste t ON t.id = s.id_type_artiste
    GROUP BY u.id, s.id_type_artiste
);

CREATE OR REPLACE VIEW v_info_artiste AS (
    SELECT info.*,vn.note,vn.nombre_element
    FROM v_artiste_information info 
    JOIN v_note_artiste vn ON info.id = vn.id AND vn.id_type_artiste = info.id_type_artiste
);
