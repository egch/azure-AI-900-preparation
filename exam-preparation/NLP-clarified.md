# Describe features of Natural Language Processing (NLP) workloads on Azure
## NaN
Q. When might you see NaN returned for a score in language detection?

A. When the language is ambiguous.

In language detection, a **confidence score** (e.g., `0.98`) shows how sure the system is about the detected language.

However, if the input is:
- **Too short**
- **Ambiguous**
- **Mixed-language**

…the model might **not be able to compute a valid score**. In that case, it returns:

**`NaN`** — which stands for **"Not a Number"**, meaning *"I don’t know the answer."*

#### 💡 Example:
```text
Input: "Hi"
Language: Unknown
Score: NaN
```

---

## Frequency analysis

Q. Which of the following techniques is used to determine the most commonly used words in a document?

A. Frequency analysis

### ✅ Explanation:

**Frequency analysis** is a technique used in **natural language processing (NLP)** to identify the **most commonly used words** in a document or text corpus.

It works by **counting how often each word appears**, helping to uncover patterns, themes, or keywords.

#### 🧠 Key point:
Frequency analysis is often a first step in text analysis, useful for **summarization**, **keyword extraction**, and **text preprocessing**.

--

## Q. Which part of speech synthesis in natural language processing (NLP) involves breaking text into individual words such that each word can be assigned phonetic sounds?

**A.** Tokenization  
Tokenization is a fundamental step in speech synthesis and other NLP tasks. It involves breaking down a block of text into individual units called tokens—typically words. This allows the system to analyze and process each word separately, making it possible to assign phonetic representations, apply pronunciation rules, and generate natural-sounding speech.

[Learn more on Microsoft Docs](https://learn.microsoft.com/training/modules/recognize-synthesize-speech/)

---

## Q. When using the Azure AI Service for Language, what should you use to provide further information online about entities extracted from a text?

**A.** Entity Linking  
Entity linking is the process of identifying entities mentioned in text and connecting them to relevant information sources, such as Wikipedia or other knowledge bases. This helps provide additional context and disambiguates entities that may have similar names.

[Learn more on Microsoft Docs](https://learn.microsoft.com/azure/cognitive-services/language-service/entity-linking/overview)

---

## Q. What can search, classify, and compare sources of text for similarity?

**A.** Embeddings  
Embeddings are numerical representations of text that capture the meaning and context of words, phrases, or entire documents. By converting text into vectors, embeddings enable systems to efficiently search, classify, and compare text based on semantic similarity rather than exact wording.

[Learn more on Microsoft Docs](https://learn.microsoft.com/azure/search/vector-search-overview)


## NLP & Speech: Audio Translation with Azure Speech Service

**Q. Can you use the Azure Speech service to translate an audio file content from one language to another?**  
**A. Yes**  
[Source: Microsoft Learn](https://learn.microsoft.com/azure/ai-services/speech-service/speech-translation)

Azure Speech service supports **speech translation**, which:

1. **Recognizes** spoken words from an audio file (speech-to-text)
2. **Translates** the transcribed text into a different language (text-to-text)
3. Optionally **synthesizes** the translation as speech (text-to-speech)

It’s useful in real-time multilingual communication, subtitles, and global voice apps.


## NLP: Universal Language Model in Speech-to-Text

**Q. For which two scenarios is the Universal Language Model used by the speech-to-text API optimized?**  
**A. Conversational / Dictation**  
[Source: Microsoft Learn](https://learn.microsoft.com/training/modules/recognize-synthesize-speech/2-get-started-azure)

The **Universal Language Model** in Azure’s **speech-to-text API** is optimized for:

- **Conversational** speech — ideal for natural, back-and-forth dialogue, like interviews or meetings.
- **Dictation** — optimized for clear, structured monologue, such as reading or medical note-taking.

This helps improve transcription accuracy in common, real-world language scenarios.
