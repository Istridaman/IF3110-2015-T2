
package model.question;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "QuestionWS", targetNamespace = "http://question.model/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface QuestionWS {


    /**
     * 
     * @param questionId
     * @param token
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "Integer", targetNamespace = "")
    @RequestWrapper(localName = "deleteQuestion", targetNamespace = "http://question.model/", className = "model.question.DeleteQuestion")
    @ResponseWrapper(localName = "deleteQuestionResponse", targetNamespace = "http://question.model/", className = "model.question.DeleteQuestionResponse")
    @Action(input = "http://question.model/QuestionWS/deleteQuestionRequest", output = "http://question.model/QuestionWS/deleteQuestionResponse")
    public int deleteQuestion(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "question_id", targetNamespace = "")
        int questionId);

    /**
     * 
     * @return
     *     returns java.util.List<model.question.Question>
     */
    @WebMethod
    @WebResult(name = "Question", targetNamespace = "")
    @RequestWrapper(localName = "getAllQuestions", targetNamespace = "http://question.model/", className = "model.question.GetAllQuestions")
    @ResponseWrapper(localName = "getAllQuestionsResponse", targetNamespace = "http://question.model/", className = "model.question.GetAllQuestionsResponse")
    @Action(input = "http://question.model/QuestionWS/getAllQuestionsRequest", output = "http://question.model/QuestionWS/getAllQuestionsResponse")
    public List<Question> getAllQuestions();

    /**
     * 
     * @param topic
     * @param content
     * @param token
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "Integer", targetNamespace = "")
    @RequestWrapper(localName = "addQuestion", targetNamespace = "http://question.model/", className = "model.question.AddQuestion")
    @ResponseWrapper(localName = "addQuestionResponse", targetNamespace = "http://question.model/", className = "model.question.AddQuestionResponse")
    @Action(input = "http://question.model/QuestionWS/addQuestionRequest", output = "http://question.model/QuestionWS/addQuestionResponse")
    public int addQuestion(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "topic", targetNamespace = "")
        String topic,
        @WebParam(name = "content", targetNamespace = "")
        String content);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<model.question.Question>
     */
    @WebMethod
    @WebResult(name = "Question", targetNamespace = "")
    @RequestWrapper(localName = "searchQuestions", targetNamespace = "http://question.model/", className = "model.question.SearchQuestions")
    @ResponseWrapper(localName = "searchQuestionsResponse", targetNamespace = "http://question.model/", className = "model.question.SearchQuestionsResponse")
    @Action(input = "http://question.model/QuestionWS/searchQuestionsRequest", output = "http://question.model/QuestionWS/searchQuestionsResponse")
    public List<Question> searchQuestions(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param questionId
     * @return
     *     returns model.question.Question
     */
    @WebMethod
    @WebResult(name = "Question", targetNamespace = "")
    @RequestWrapper(localName = "getQuestionByID", targetNamespace = "http://question.model/", className = "model.question.GetQuestionByID")
    @ResponseWrapper(localName = "getQuestionByIDResponse", targetNamespace = "http://question.model/", className = "model.question.GetQuestionByIDResponse")
    @Action(input = "http://question.model/QuestionWS/getQuestionByIDRequest", output = "http://question.model/QuestionWS/getQuestionByIDResponse")
    public Question getQuestionByID(
        @WebParam(name = "question_id", targetNamespace = "")
        int questionId);

    /**
     * 
     * @param questionId
     * @param topic
     * @param content
     * @param token
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "Integer", targetNamespace = "")
    @RequestWrapper(localName = "editQuestion", targetNamespace = "http://question.model/", className = "model.question.EditQuestion")
    @ResponseWrapper(localName = "editQuestionResponse", targetNamespace = "http://question.model/", className = "model.question.EditQuestionResponse")
    @Action(input = "http://question.model/QuestionWS/editQuestionRequest", output = "http://question.model/QuestionWS/editQuestionResponse")
    public int editQuestion(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "question_id", targetNamespace = "")
        int questionId,
        @WebParam(name = "topic", targetNamespace = "")
        String topic,
        @WebParam(name = "content", targetNamespace = "")
        String content);

}
