# DeepCodeSet
DeepCode is a set of instructional whose goal is to assist the development of adaptive instructional systems (AISs) that foster the monitoring, understanding, scaffolding, and acquisition of code comprehension skills for students learning to program. It can be also used for assessment, problem-solving, and in various other learning activities and instructional purposes. 

The insturctional materials consists of code examples with comments and annotations as described in [guideline](https://github.com/CSEdPad/annotated-java-examples/blob/master/guidelines.md).

## Metadata
The code examples consists of meta data which are described as below.

### Logical Steps (logical_step)
A logical step is a concise sentence  that describes at a very high level the functionality of a chunk of code with respect to the overall goal of the code. It refers mostly to objects and relations of the domain/problem being solved. It link the code chunk to the story/real-world application at a very high level.

Here,
* Chunk of the code referes to the logically seperable block of code with subgoals
* All logical steps together should form meaningful, higher-level steps in the overall solution/algorithm implemented by the code as whole.
* Cross-references/usage of concepts from the ‘program model’, i.e., implementation, are avoided or kept at a minimum when describing a logical step.

### Logical step details (logical_step_details)
Logical step details link the higher level logical step to how the step is actually carried out in the code. That is, the logical step links the code to the story/real-world problem at a very high level whereas the logical step details provides details about how the logical step is being carried out in computer code. The logical_step_details field links the problem/domain model to the implementation, i.e., to the program model.
 
### Statement comments (stm_comment)
Statement comment provides an implementation details for only a line of code that refer to target topic for which the code example is created. It refers more to program model (i.e. describes implementation details). The statement level comment should not necessarily be about the general function of the statement but rather focus on the parts related to the new concept.  For instance, if the topic is arrays, parts of a for loop that do not refer to arrays should not be explained in detail in a statement level comment.

The main goal of the statement level comments is to make student understand any element/aspect of the topic/concept of focus. 

### Question and Answer
Questions and Answers serve as hints in the form of scaffolding questions and the corresponding correct answers to those hints. The questions should cover all the important or key elements of the logical steps, the logical step details, and newly introduced concepts. 

The goal of questions and answers below the logical step detail is to use those hints to scaffold students’ self-explanations of the logical steps and logical step details.  The first question is vague as "What does the following code block do?" and should elicit as an answer the logical step.  The rest of the questions should elicit the important parts of the logical_step_details field.

Simialry, one or more scaffolding questions after the statement comment are meant elicit statment comments. In a typical case, there should be one question which should elicit the statement level comment as an answer. If the statement comment has more than one important aspect related to the target topic/concept, then, more than one question may be necessary. In general, there should be one question per each important aspect. Similarly, if there is more than one construct in the line of code referring to the target concept/topic then more than one question and answer may be necessary.
