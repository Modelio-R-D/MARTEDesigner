/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("5f08ea60-0de3-493b-b378-f01584efdaac")
public class TimedProcessingMessage {
    @objid ("80852c2e-332e-4c15-be64-f985c6fd29ce")
    public static final String STEREOTYPE_NAME = "TimedProcessing_Message";

    @objid ("83da82a0-46a5-40ad-817f-ffa22d0b4831")
    public static final String TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE = "TimedProcessing_Message_duration";

    @objid ("ba5e5b36-3f4d-40aa-9f99-21fe0830cba3")
    public static final String TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE = "TimedProcessing_Message_finish";

    @objid ("7729607d-ca41-4a3c-9488-8ccb65a4c164")
    public static final String TIMEDPROCESSING_MESSAGE_ON_TAGTYPE = "TimedProcessing_Message_on";

    @objid ("c4b6d9b2-b357-4964-9131-e068750e138d")
    public static final String TIMEDPROCESSING_MESSAGE_START_TAGTYPE = "TimedProcessing_Message_start";

    /**
     * The underlying {@link Message} represented by this proxy, never null.
     */
    @objid ("e88c4892-6f78-48ab-af23-d9839cbdf2be")
    protected final Message elt;

    /**
     * Tells whether a {@link TimedProcessingMessage proxy} can be instantiated from a {@link MObject} checking it is a {@link Message} stereotyped << TimedProcessing_Message >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("70ab96f2-fb49-450f-b828-cb6e5b1a69f8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Message) && ((Message) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingMessage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Message} stereotyped << TimedProcessing_Message >> then instantiate a {@link TimedProcessingMessage} proxy.
     * 
     * @return a {@link TimedProcessingMessage} proxy on the created {@link Message}.
     */
    @objid ("e769ece0-d949-4cf2-8e5f-61a99ed8dfe6")
    public static TimedProcessingMessage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Message");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingMessage.STEREOTYPE_NAME);
        return TimedProcessingMessage.instantiate((Message)e);
    }

    /**
     * Tries to instantiate a {@link TimedProcessingMessage} proxy from a {@link Message} stereotyped << TimedProcessing_Message >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Message
     * @return a {@link TimedProcessingMessage} proxy or <i>null</i>.
     */
    @objid ("588e7c8d-ea89-4d6d-bc16-62852bd7c772")
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
    @objid ("8425c2f0-776c-4e4b-a172-e3d87923bc59")
    public static TimedProcessingMessage safeInstantiate(final Message obj) throws IllegalArgumentException {
        if (TimedProcessingMessage.canInstantiate(obj))
        	return new TimedProcessingMessage(obj);
        else
        	throw new IllegalArgumentException("TimedProcessingMessage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("84f84e55-3b83-41a4-9094-c5d1f9e908b1")
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
    @objid ("8a8ef421-3675-4a64-baef-710678950d66")
    public Message getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedProcessing_Message_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8174f741-4a87-4397-9dc7-b4a2dbd30611")
    public String getTimedProcessing_Message_duration() {
        return this.elt.getTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_Message_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5944db5e-df24-4040-a5f4-e69a969426c9")
    public String getTimedProcessing_Message_finish() {
        return this.elt.getTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedProcessing_Message_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6842a65b-3982-47e5-a8e5-bd895b7fedb2")
    public List<String> getTimedProcessing_Message_on() {
        return this.elt.getTagValues(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_Message_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da2246ce-15a6-40cb-80e7-ffae88e0ed08")
    public String getTimedProcessing_Message_start() {
        return this.elt.getTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_START_TAGTYPE_ELT);
    }

    @objid ("3c400199-94d8-4c18-8780-5de0201327b9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedProcessing_Message_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("956e05cb-e2f6-4ff4-a2bb-8c0af2252687")
    public void setTimedProcessing_Message_duration(final String value) {
        this.elt.putTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'TimedProcessing_Message_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f9637966-c768-499b-9ee6-93326fd713a4")
    public void setTimedProcessing_Message_finish(final String value) {
        this.elt.putTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedProcessing_Message_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94554b0f-010b-4514-9ba7-8bbbaf1a4bb3")
    public void setTimedProcessing_Message_on(final List<String> values) {
        this.elt.putTagValues(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'TimedProcessing_Message_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f77e523-ae00-41e4-8bb8-5e5ac7651364")
    public void setTimedProcessing_Message_start(final String value) {
        this.elt.putTagValue(TimedProcessingMessage.MdaTypes.TIMEDPROCESSING_MESSAGE_START_TAGTYPE_ELT, value);
    }

    @objid ("dc3cbae1-0e31-4b07-ad94-728a97a73d12")
    protected TimedProcessingMessage(final Message elt) {
        this.elt = elt;
    }

    @objid ("efe3b062-58be-4d8c-8479-17a882eaff00")
    public static final class MdaTypes {
        @objid ("dfd53b32-f6de-4bc6-b273-63b341e4a8c1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("28e148cf-5fc4-4849-9f85-db5a96dbae97")
        public static TagType TIMEDPROCESSING_MESSAGE_DURATION_TAGTYPE_ELT;

        @objid ("5321cfe0-fd6e-4351-ae68-46422587fe0e")
        public static TagType TIMEDPROCESSING_MESSAGE_START_TAGTYPE_ELT;

        @objid ("a55a16fe-b430-43de-bb25-8184cfb74f06")
        public static TagType TIMEDPROCESSING_MESSAGE_FINISH_TAGTYPE_ELT;

        @objid ("f5f57cf6-30fb-40fb-a09c-b12a8051f190")
        public static TagType TIMEDPROCESSING_MESSAGE_ON_TAGTYPE_ELT;

        @objid ("3c2763f2-c10d-48e3-b51e-560242ed9bc1")
        private static Stereotype MDAASSOCDEP;

        @objid ("3baed04b-2761-4acc-8eb0-77959d4f8b44")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c04a5914-9171-4364-8164-e1dafb284f7d")
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
