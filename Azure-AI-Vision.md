# Azure AI Vision

## Difference Between Azure AI Vision and Computer Vision

### 🔹 Azure AI Vision
**Azure AI Vision** is the **modern umbrella term** that includes a variety of vision-related services under **Azure AI Services**. It provides:

- **Image Analysis (v4)** – Advanced image recognition and analysis.
- **OCR (Optical Character Recognition)** – For reading printed and handwritten text.
- **Spatial Analysis** – For people and movement detection using video.
- **Video Indexer integration** – For extracting metadata from videos.
- **Custom Vision** – For training custom image classifiers and object detectors.

> ✅ It replaces and improves upon the older **Computer Vision** service.

---

### 🔹 Computer Vision
**Computer Vision** was the **legacy service** that mainly offered:

- Basic image analysis (tags, descriptions, categories)
- OCR for printed and handwritten text
- Thumbnail generation and image type detection

It mostly refers to the **v3.x versions** of the API.

> ⚠️ Computer Vision (v3.2) is being deprecated in favor of **Azure AI Vision v4**.

---

### ✅ Summary Comparison

| Feature                 | Azure AI Vision                        | Computer Vision                      |
|------------------------|----------------------------------------|-------------------------------------|
| **Scope**              | Broad – unified platform for all vision services | Narrow – limited to basic image analysis |
| **Current Status**     | **Active and recommended**             | Legacy, being deprecated            |
| **Version**            | v4 (e.g., Image Analysis v4)           | v3.x                                |
| **OCR Support**        | Yes, with improved capabilities        | Yes                                 |
| **Custom Models**      | Yes (via Custom Vision)                | No                                  |
| **Video Support**      | Yes (with Video Indexer integration)   | No                                  |

---

### 🔧 Recommendation
If you're starting a new project, **use Azure AI Vision** to benefit from the latest improvements, unified API structure, and broader capabilities.
