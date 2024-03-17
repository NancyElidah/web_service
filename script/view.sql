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