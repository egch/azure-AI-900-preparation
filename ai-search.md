# Azure AI search
>Azure AI Search is a standalone service designed for building advanced search experiences over your data. It supports full-text search, vector similarity search, and hybrid search, making it suitable for applications like document retrieval, product catalogs, and knowledge mining.

### Creation
Marketplace / Azure AI Search / Create

### Index & Indexer
> An index is a data structure that stores searchable content, enabling efficient full-text search and filtered queries. It defines the schema, including fields and their data types, and holds the actual data that users can query.

> An indexer is a component that connects to a data source, extracts data, and populates the index. It automates the process of data ingestion, transformation, and indexing, and can be scheduled to run at specified intervals or triggered on demand.​


## Azure AI Search – What is a Search Index?

In **Azure AI Search**, a **search index** is like a table in a database, optimized for **full-text search**. It stores documents with defined fields and enables powerful search capabilities.

## 📦 Index Structure

An index contains:
- **Fields**: Define the schema (e.g., title, author).
- **Documents**: JSON records (like rows).

Each field can be:
- `searchable`: for full-text search
- `filterable`: for filtering results
- `sortable`: for ordering
- `facetable`: for group/filter by category
- `retrievable`: included in search results

### Example

```json
{
  "name": "books-index",
  "fields": [
    { "name": "id", "type": "Edm.String", "key": true },
    { "name": "title", "type": "Edm.String", "searchable": true },
    { "name": "author", "type": "Edm.String", "filterable": true },
    { "name": "publishYear", "type": "Edm.Int32", "sortable": true }
  ]
}
```

### How It Works
1. Create an index – define schema & field behavior.

2. Upload documents – push data to index.

3. Search – use full-text or filtered queries.
4. 
### azsearchstore
[Generate a sample search app](https://azsearchstore.azurewebsites.net/azsearchgenerator/)

### Resources

[How to make your data searchable with Azure Search and AI | Azure Tips and Tricks](https://www.youtube.com/watch?v=OQDRNQD1LDk)


---
[Home](README.md)