insert into role values
(1, 'Client'),
(10, 'Artiste');

insert into type_artiste (intitule) values
('Peintre'),
('Compositeur'),
('Danseur');

insert into style(id_type_artiste, style) values
(1, 'Impressionnisme'),
(1, 'Cubisme'),
(1, 'Art abstrait'),
(1, 'Autre'),
(2, 'Romantique'),
(2, 'Baroque'),
(2, 'Contemporain'),
(2, 'Autre'),
(3, 'Ballet'),
(3, 'Danse contemporaine'),
(3, 'Danse urabine'),
(3, 'Autre');

insert into type_description (id_type_artiste, description, type) values
(1, 'Technique Utilise', 'text'),
(1, 'Longeur', 'text'),
(1, 'Largeur', 'text'),
(1, 'Materiaux Utilise', 'text'),
(2, 'Genre Musical', 'text'),
(2, 'Duree', 'time'),
(3, 'Stucture', 'text'),
(3, 'Duree', 'time');



INSERT INTO utilisateur (id, nom, prenom, pseudo, email, mot_de_passe, genre, id_role) VALUES
('100001', 'Dupont', 'Jean', 'JDupont', 'jdupont@example.com', 'motdepasse123', 1, 1),
('200001', 'Durand', 'Alice', 'ADurand', 'adurand@example.com', 'motdepasse456', 0, 10);

INSERT INTO utilisateur_type_artiste (id_utilisateur, id_type_artiste, bio) VALUES
('200001', 1, 'Artiste peintre renommé pour ses paysages colorés.'),
('200001', 2, 'Compositeur de musique électronique passionné.'),
('200001', 3, 'Danseur professionnel spécialisé en ballet contemporain.');



INSERT INTO collection (id, id_utilisateur, titre, date_creation, id_style, contexte_historique, message, status, etat, date_publication, couleur) VALUES
('100001', '200001', 'Ma première collection', '2024-03-16', 1, 'Contexte historique de la collection', 'Message de la collection', 0, 0, now(), 'Rouge'),
('100002', '200001', 'Collection de musique', '2024-03-16', 5, 'Contexte historique de la collection de musique', 'Message de la collection de musique', 0, 0, now(), 'Bleu'),
('100003', '200001', 'Collection de danse', '2024-03-16', 10, 'Contexte historique de la collection de danse', 'Message de la collection de danse', 0, 0, now(), 'Vert');

INSERT INTO note (id_collection, id_utilisateur, note) VALUES
('100001', '100001', 4),
('100002', '100001', 3),
('100003', '100001', 5);


INSERT INTO exposition (id, id_utilisateur, prix, date_debut, date_fin, description)
VALUES
    ('EXP001', '200001', 50.99, '2024-04-01 10:00:00', '2024-04-30 18:00:00', 'Exposition de peinture abstraite'),
    ('EXP002', 'USR002', 25.50, '2024-05-15 09:30:00', '2024-05-20 17:00:00', 'Exposition de photographie contemporaine'),
    ('EXP003', 'USR003', 35.75, '2024-06-10 12:00:00', '2024-06-20 20:00:00', 'Exposition de sculptures en bronze'),
    ('EXP004', 'USR001', 40.00, '2024-07-05 11:00:00', '2024-07-15 19:00:00', 'Exposition de dessins à la craie'),
    ('EXP005', 'USR002', 15.25, '2024-08-20 08:30:00', '2024-08-25 16:00:00', 'Exposition de gravures sur bois');
