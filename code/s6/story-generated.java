package com.azure.ai.openai.usage;  
  
import com.azure.ai.openai.OpenAIClient;  
import com.azure.ai.openai.OpenAIClientBuilder;  
import com.azure.ai.openai.models.ChatChoice;  
import com.azure.ai.openai.models.ChatCompletions;  
import com.azure.ai.openai.models.ChatCompletionsOptions;  
import com.azure.ai.openai.models.ChatRequestMessage;  
import com.azure.ai.openai.models.ChatRequestUserMessage;  
import com.azure.ai.openai.models.ChatRequestSystemMessage;  
import com.azure.ai.openai.models.ChatRequestAssistantMessage;
import com.azure.ai.openai.models.ChatResponseMessage;  
import com.azure.core.credential.TokenCredential;  
import com.azure.identity.DefaultAzureCredentialBuilder;  
  
import java.util.ArrayList;  
import java.util.List;
import java.util.Optional;  
  
public class Chat {  
    public static void main(String[] args) {  
        // Retrieve endpoint from environment variables
        String endpoint = Optional.ofNullable(System.getenv("AZURE_OPENAI_ENDPOINT")).orElse("https://egchaifoundry6542689014.openai.azure.com/");  
        String deploymentName = "gpt-4o-mini";  
        if (endpoint == null) {  
            System.err.println("Please set the AZURE_OPENAI_ENDPOINT environment variable.");  
            return;  
        }  
  
        // Initialize the OpenAI client with Entra ID (Azure AD) authentication
        TokenCredential credential = new DefaultAzureCredentialBuilder().build();  
        OpenAIClient client = new OpenAIClientBuilder()  
                .endpoint(endpoint)  
                .credential(credential)  
                .buildClient();  
  
        // Simulate chat interaction
        List<ChatRequestMessage> prompts = new ArrayList<>();
        prompts.add(new ChatRequestUserMessage("Generate a small story about how hard is to reach the first million euro, max 50 words"));
        prompts.add(new ChatRequestAssistantMessage("After years of relentless effort, Clara finally saved her first million euros. Countless sleepless nights, sacrifices, and setbacks haunted her journey. Each euro felt like a mountain climbed, each investment a risk taken. But as she held that check, the weight of her struggles transformed into a bittersweet victory."));  
  
        ChatCompletionsOptions options = new ChatCompletionsOptions(prompts)  
                .setMaxTokens(800)  
                .setTemperature(0.7)  
                .setTopP(0.95)  
                .setFrequencyPenalty((double)0)  
                .setPresencePenalty((double)0)  
                .setStop(null);  
  
        // Print the response
        try {
          ChatCompletions chatCompletions = client.getChatCompletions(deploymentName, options);  
          System.out.println(chatCompletions.toJsonString());
        }  catch (Exception e) {
          System.out.println("Error: " + e.getMessage());
        }
    }  
}