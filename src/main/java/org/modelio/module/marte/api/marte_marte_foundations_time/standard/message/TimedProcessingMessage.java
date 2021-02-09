/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Message} with << TimedProcessing_Message >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class TimedProcessingMessage {
    public static final String STEREOTYPE_NAME = "TimedProcessing_Message";

    public static final String TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE = "TimedProcessing_Message_duration";

    public static final String TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE = "TimedProcessing_Message_finish";

    public static final String TIMEDPROCESSING_MESSAGE_ON_TAGTYPE = "TimedProcessing_Message_on";

    public static final String TIMEDPROCESSING_MESSAGE_START_TAGTYPE = "TimedProcessing_Message_start";

    /**
     * The underlying {@link Message} represented by this proxy, never null.
     */
    protected final Message elt;

    /**
     * Tells whether a {@link TimedProcessingMessage proxy} can be instantiated from a {@link MObject} checking it is a {@link Message} stereotyped << TimedProcessing_Message >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Message) && ((Message) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingMessage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Message} stereotyped << TimedProcessing_Message >> then instantiate a {@link TimedProcessingMessage} proxy.
     * 
     * @return a {@link TimedProcessingMessage} proxy on the created {@link Message}.
     */
    public static TimedProcessingMessage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Message");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingMessage.STEREOTYPE_NAME);
        return TimedProcessingMessage.instantiate((Message)e);
    }

    /**
     * Tries to instantiate a {@link TimedProcessingMessage} proxy from a {@link Message} stereotyped << TimedProcessing_Message >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Message
     * @return a {@link TimedProcessingMessage} proxy or <i>null</i>.
     */
    public static TimedProcessingMessage instantiate(final Message obj) {
        return TimedProcessingMessage.canInstantiate(obj) ? new TimedProcessingMessage(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedProcessingMessage} proxy from a {@link Message} stereotyped << TimedProcessing_Message >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Message}
     * @return a {@link TimedProcessingMessage} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static TimedProcessingMessage safeInstantiate(final Message obj) throws IllegalArgumentException {
        if (TimedProcessingMessage.canInstantiate(obj))
        	return new TimedProcessingMessage(obj);
        else
        	throw new IllegalArgumentException("TimedProcessingMessage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TimedProcessingMessage other = (TimedProcessingMessage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Message}. 
     * @return the Message represented by this proxy, never null.
     */
    public Message getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedProcessing_Message_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedProcessing_Message_duration() {
        return this.elt.getTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_Message_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedProcessing_Message_finish() {
        return this.elt.getTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedProcessing_Message_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getTimedProcessing_Message_on() {
        return this.elt.getTagValues(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_Message_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getTimedProcessing_Message_start() {
        return this.elt.getTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_START_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedProcessing_Message_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedProcessing_Message_duration(final String value) {
        this.elt.putTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'TimedProcessing_Message_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedProcessing_Message_finish(final String value) {
        this.elt.putTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedProcessing_Message_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedProcessing_Message_on(final List<String> values) {
        this.elt.putTagValues(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'TimedProcessing_Message_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setTimedProcessing_Message_start(final String value) {
        this.elt.putTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_START_TAGTYPE_ELT, value);
    }

    protected TimedProcessingMessage(final Message elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE_ELT;

        public static TagType TIMEDPROCESSING_MESSAGE_START_TAGTYPE_ELT;

        public static TagType TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE_ELT;

        public static TagType TIMEDPROCESSING_MESSAGE_ON_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b5245495-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5245496-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_MESSAGE_START_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5245497-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5245498-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_MESSAGE_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bde61b04-c7fd-11e0-9823-0027103f347c");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
