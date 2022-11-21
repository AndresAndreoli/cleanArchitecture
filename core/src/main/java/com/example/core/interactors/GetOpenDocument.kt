package com.example.core.interactors
import com.example.core.data.DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {
    operator fun invoke() = documentRepository.getOpenDocument()
}