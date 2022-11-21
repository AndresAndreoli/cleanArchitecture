package com.example.core.interactors

import com.example.core.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke() = documentRepository.getDocuments()
}