package br.com.m9tzin.todolist.task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

 /* Usuário (ID_User)
     * ID 
     * Descrição
     * Título
     * Data de início
     * Data de término
     * Prioridade
     */

@Data
@Entity(name = "tb_tasks")     
public class TaskModel {
    @Id
    @GeneratedValue(generator = "UUID")
     private UUID id;
     private String description;

     @Column(length = 50) //Limite de caracteres do título
     private String title;
     private LocalDateTime startAt;
     private LocalDateTime endAt;

     @Column(length = 50) //Limite de caracteres priority
     private String priority;

     private UUID idUser;
     
     @CreationTimestamp
     private LocalDateTime createdAt;

     public void setTitle(String title) throws Exception{
        if(title.length() > 50 ){
            /*Lançamento de exceções com mensagem */
            throw new Exception("O campo title deve conter no máximo 50 caracteres.");
        }
        this.title = title;

     }
    
}
