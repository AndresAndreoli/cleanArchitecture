package com.example.core.interactors

import com.example.core.data.DocumentRepository
import com.example.core.domain.Document

class AddDocument(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)
}