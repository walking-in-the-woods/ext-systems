package edu.javacourse.student.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "sr_student_document")
public class StudentDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long DocumentId;
    @Column(name = "document_number")
    private Long DocumentNumber;
    @Column(name = "document_date")
    private LocalDate documentDate;
    @Column(name = "expired_date")
    private LocalDate expiredDate;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;
    @Column(name = "student_form")
    @Enumerated
    private StudentForm studentForm;

    public Long getDocumentId() {
        return DocumentId;
    }

    public void setDocumentId(Long documentId) {
        DocumentId = documentId;
    }

    public Long getDocumentNumber() {
        return DocumentNumber;
    }

    public void setDocumentNumber(Long documentNumber) {
        DocumentNumber = documentNumber;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public StudentForm getStudentForm() {
        return studentForm;
    }

    public void setStudentForm(StudentForm studentForm) {
        this.studentForm = studentForm;
    }
}
