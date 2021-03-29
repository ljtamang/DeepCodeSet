# DeepCodeSet
DeepCode is a set of instructional materials to assist with the development of adaptive instructional systems (AISs) that foster the monitoring, understanding,and scaffolding of code comprehension processes and the acquisition of code comprehension skills for students learning to program. It can be also used for other purposes such as assessment, problem-solving, and in various other learning activities and for other instructional purposes. 

## About Metadata

### Logical Steps (logical_step)
A logical step is a concise sentence  that describes at avery high level the functionality of a chunk of code with respect to the overall goal of the code. It refers mostly to objects and relations of the domain/problem being solved. It link the code chunk to the story/real-world application at a very high level.

Here,
* Chunk of the code referes to the logically seperable block of code with subgoals
* All logical steps together should form meaningful, higher-level steps in the overall solution/algorithm implemented by the code as whole.
* Cross-references/usage of concepts from the ‘program model’, i.e., implementation, are avoided or kept at a minimum when describing a logical step.

### Logical step details (logical_step_details)
Logical step details link the higher level logical step to how the step is actually carried out in the code. That is, the logical step links the code to the story/real-world problem at a very high level whereas the logical step details provides details about how the logical step is being carried out in computer code. The logical_step_details field links the problem/domain model to the implementation, i.e., to the program model.
 
### Statement comments (stm_comment)
Statement level comments serve the goal of making students focus and understand any element/aspect of the topic/concept of focus. Statment comment appear only for the statement (line of code) that refer to the newly introduced topic (i.e. target topic for which the code example is created). It refers more to program model i.e. describes implementation details for the statement focusing on key aspects of the new concept. The statement level comment should not necessarily be about the general function of the statement but rather focus on the parts related to the new concept. For instance, if the topic is arrays, parts of a for loop that do not refer to arrays should not be explained in detail in a statement level comment.

### Question and Answer
 Questions and Answers pair serve as hint in the form of scaffolding questions and thecorresponding correct answers to those hints. The questions should cover all the important or key elements of the logical steps, the logical step details, and statement level comment (newly introduced concepts). The goal is to use those hints to scaffold students’self-explanations of the logical steps and logical step details as well as the statement level explanations.
 
 After the statement comment, one or more scaffolding questions should be added and the corresponding answers. The questions are supposed to elicit responses about the important aspects of the target topic/concept that are present in the corresponding line of code.  In a typical case, there should be one question which should elicit the statement level comment as an answer. If the statement comment has more than one important aspect related to the target topic/concept then more than one question may be necessary, in general, thereshould be one question per each important aspect. Similarly, if there is more than one construct in the line ofcode referring to the target concept/topic then more than one question and answer may be necessary.

## How does logical step detail and statment level comment differ?
The goal of the logical step details comments and related questions is to guide students to articulate the logical steps whereas statement level comments serve the goal of making students focus and understand any element/aspect of the topic/concept of focus.

Statement level comment is about a statement which is part of some logical step. The logical step questions may ask about this statement through one of the questions associated with a logical step, which is perfectly fine. To avoid redundancy and to follow the guidelines for a statement level comment, the general principle to be followed is to focus the questions associated with a logical step on the general substeps (the entire statement corresponding to a statement comment may be such a substep) and the questions associated with a statement level commentshould focus on the aspects/elements of the statement that refer to the new concept/topic. A question about what the overall statement does may be used in the latter case in which case a similar question may or maynot be used in the logical step questions (redundancy cannot hurt, but may be annoying to some students -dynamically and user-adaptively asking the questions may mitigate this issue).



