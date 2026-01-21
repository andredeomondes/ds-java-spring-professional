// Tabela Categoria
INSERT INTO tb_categoria (description) VALUES ('Curso')
INSERT INTO tb_categoria (description) VALUES ('Oficina')

// Tabela Atividade
INSERT INTO tb_atividade(name,description,price, categoria_id) VALUES ('Curso de HTML','Aprenda HTML de forma prática',80.00,1)
INSERT INTO tb_atividade(name,description,price, categoria_id) VALUES ('Oficina de Github','Controle versões de seus projetos',50.00,2)

// Tabela Bloco
// Formato de data e hora: 'YYYY-MM-DDTHH:MM:SS'
// Exemplo: '2017-09-25T09:00:00'
// OBS: O tipo TIME WITH TIME ZONE é utilizado para armazenar data e hora com fuso horário
INSERT INTO tb_bloco(start,end, atividade_id) VALUES (TIME WITH TIMEZONE '2017-09-25T09:00:00', TIME WITH TIME ZONE'2017-09-25T11:00:00',1)
INSERT INTO tb_bloco(start,end, atividade_id) VALUES (TIME WITH TIMEZONE '2017-09-25T14:00:00', TIME WITH TIME ZONE'2017-09-25T18:00:00',2)
INSERT INTO tb_bloco(start,end, atividade_id) VALUES (TIME WITH TIMEZONE '2017-09-26T08:00:00', TIME WITH TIME ZONE'2017-09-26T11:00:00',2)


// Tabela Participante
// Inserção de Participantes
INSERT INTO tb_participante(name,email) VALUES ('José Silva', 'jose@gmail.com')
INSERT INTO tb_participante(name,email) VALUES ('Tiago Faria','tiago@gmail.com')
INSERT INTO tb_participante(name,email) VALUES ('Maria do Rosário','maria@gmail.com')
INSERT INTO tb_participante(name,email) VALUES ('Teresa Silva','teresa@gmail.com')

// Tabela Participante e Atividade
INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES (1,1)
INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES (1,2)
INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES(2,1)
INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES(3,1)
INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES(3,2)
INSERT INTO tb_participante_atividade(participante_id, atividade_id) VALUES(4,2)





