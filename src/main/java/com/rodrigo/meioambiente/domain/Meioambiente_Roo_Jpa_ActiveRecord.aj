// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.rodrigo.meioambiente.domain;

import com.rodrigo.meioambiente.domain.Meioambiente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Meioambiente_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Meioambiente.entityManager;
    
    public static final List<String> Meioambiente.fieldNames4OrderClauseFilter = java.util.Arrays.asList("descricao", "data_hr", "local_rua", "local_numero", "local_complemento", "local_cidade", "local_estado");
    
    public static final EntityManager Meioambiente.entityManager() {
        EntityManager em = new Meioambiente().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Meioambiente.countMeioambientes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Meioambiente o", Long.class).getSingleResult();
    }
    
    public static List<Meioambiente> Meioambiente.findAllMeioambientes() {
        return entityManager().createQuery("SELECT o FROM Meioambiente o", Meioambiente.class).getResultList();
    }
    
    public static List<Meioambiente> Meioambiente.findAllMeioambientes(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Meioambiente o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Meioambiente.class).getResultList();
    }
    
    public static Meioambiente Meioambiente.findMeioambiente(Long id) {
        if (id == null) return null;
        return entityManager().find(Meioambiente.class, id);
    }
    
    public static List<Meioambiente> Meioambiente.findMeioambienteEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Meioambiente o", Meioambiente.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Meioambiente> Meioambiente.findMeioambienteEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Meioambiente o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Meioambiente.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Meioambiente.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Meioambiente.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Meioambiente attached = Meioambiente.findMeioambiente(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Meioambiente.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Meioambiente.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Meioambiente Meioambiente.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Meioambiente merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
