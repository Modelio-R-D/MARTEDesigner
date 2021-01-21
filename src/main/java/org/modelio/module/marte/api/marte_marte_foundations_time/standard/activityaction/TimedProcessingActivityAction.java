/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.activityaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
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
 * Proxy class to handle a {@link ActivityAction} with << TimedProcessing_ActivityAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2b9bbc9b-1550-492e-9031-63b5cad0888c")
public class TimedProcessingActivityAction {
    @objid ("99b0d6bc-202b-4c62-bfe5-3a62f5220a06")
    public static final String STEREOTYPE_NAME = "TimedProcessing_ActivityAction";

    @objid ("7b6ecedd-1d5d-4385-a212-92a032fa5ae8")
    public static final String TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE = "TimedProcessing_ActivityAction_duration";

    @objid ("35b7a364-0051-4223-9f98-46bc15e20941")
    public static final String TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE = "TimedProcessing_ActivityAction_finish";

    @objid ("071bf4c6-48fd-4332-8aac-c4e2bbf592e0")
    public static final String TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE = "TimedProcessing_ActivityAction_on";

    @objid ("729be5ad-aac4-4f29-8850-79c63e3dce4e")
    public static final String TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE = "TimedProcessing_ActivityAction_start";

    /**
     * The underlying {@link ActivityAction} represented by this proxy, never null.
     */
    @objid ("d9c3b565-8647-42a9-b0ba-bd6c88c73c66")
    protected final ActivityAction elt;

    /**
     * Tells whether a {@link TimedProcessingActivityAction proxy} can be instantiated from a {@link MObject} checking it is a {@link ActivityAction} stereotyped << TimedProcessing_ActivityAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8ce5f349-c0d3-4b3b-bb0a-ce77a1928f2c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ActivityAction) && ((ActivityAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingActivityAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ActivityAction} stereotyped << TimedProcessing_ActivityAction >> then instantiate a {@link TimedProcessingActivityAction} proxy.
     * 
     * @return a {@link TimedProcessingActivityAction} proxy on the created {@link ActivityAction}.
     */
    @objid ("6a5584aa-3a31-4e38-b218-550b1de30936")
    public static TimedProcessingActivityAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ActivityAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingActivityAction.STEREOTYPE_NAME);
        return TimedProcessingActivityAction.instantiate((ActivityAction)e);
    }

    /**
     * Tries to instantiate a {@link TimedProcessingActivityAction} proxy from a {@link ActivityAction} stereotyped << TimedProcessing_ActivityAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ActivityAction
     * @return a {@link TimedProcessingActivityAction} proxy or <i>null</i>.
     */
    @objid ("34cf4db8-22b2-40f8-a037-40f639cda52e")
    public static TimedProcessingActivityAction instantiate(final ActivityAction obj) {
        return TimedProcessingActivityAction.canInstantiate(obj) ? new TimedProcessingActivityAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedProcessingActivityAction} proxy from a {@link ActivityAction} stereotyped << TimedProcessing_ActivityAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ActivityAction}
     * @return a {@link TimedProcessingActivityAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5fb176d1-5647-4459-8647-0e9dcdf82459")
    public static TimedProcessingActivityAction safeInstantiate(final ActivityAction obj) throws IllegalArgumentException {
        if (TimedProcessingActivityAction.canInstantiate(obj))
        	return new TimedProcessingActivityAction(obj);
        else
        	throw new IllegalArgumentException("TimedProcessingActivityAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("89e29d57-6879-41ed-9b76-f04dfdeb02c9")
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
        TimedProcessingActivityAction other = (TimedProcessingActivityAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ActivityAction}. 
     * @return the ActivityAction represented by this proxy, never null.
     */
    @objid ("ceb0bba6-58dc-4955-8ca7-22d88fe9aecb")
    public ActivityAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedProcessing_ActivityAction_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4700c924-1b10-47fc-8425-8ba0a24f1f20")
    public String getTimedProcessing_ActivityAction_duration() {
        return this.elt.getTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_ActivityAction_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ba2f90c-2a45-436c-abb8-1f9ff9ecd34f")
    public String getTimedProcessing_ActivityAction_finish() {
        return this.elt.getTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedProcessing_ActivityAction_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3ebd7eac-1411-469c-8c0b-d4d7fc27468c")
    public List<String> getTimedProcessing_ActivityAction_on() {
        return this.elt.getTagValues(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_ActivityAction_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("743e3376-c173-4598-8596-2cd5b911f98a")
    public String getTimedProcessing_ActivityAction_start() {
        return this.elt.getTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE_ELT);
    }

    @objid ("f8132c76-ace4-4a4f-b638-b24503185d9a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedProcessing_ActivityAction_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4cb05382-244c-43bf-9cac-f603da411f40")
    public void setTimedProcessing_ActivityAction_duration(final String value) {
        this.elt.putTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'TimedProcessing_ActivityAction_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa9f6387-77e3-4fb5-a094-b63e883fd16f")
    public void setTimedProcessing_ActivityAction_finish(final String value) {
        this.elt.putTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedProcessing_ActivityAction_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0547d254-2275-43ca-89ee-e20ce5e782dd")
    public void setTimedProcessing_ActivityAction_on(final List<String> values) {
        this.elt.putTagValues(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'TimedProcessing_ActivityAction_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("df9091d7-9b08-4917-8714-6245b4819d49")
    public void setTimedProcessing_ActivityAction_start(final String value) {
        this.elt.putTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE_ELT, value);
    }

    @objid ("6a8f8f15-e9ad-4531-9d93-2222e6a02d65")
    protected TimedProcessingActivityAction(final ActivityAction elt) {
        this.elt = elt;
    }

    @objid ("b108101f-458c-430d-94ed-7416339591bf")
    public static final class MdaTypes {
        @objid ("5599cdaa-1a99-4aa3-a549-63961da60d53")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("483a7738-c038-46cc-bec2-48a3b679465b")
        public static TagType TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE_ELT;

        @objid ("cc282196-fab3-4460-a1fe-bddd47f314a0")
        public static TagType TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE_ELT;

        @objid ("4f2e1caf-d8ad-4588-98db-0a9530040916")
        public static TagType TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE_ELT;

        @objid ("0b0ff036-d812-49f3-bf79-cfa9e50add54")
        public static TagType TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE_ELT;

        @objid ("2f2f9e25-2e97-4b35-bb8c-b8cb153d9f21")
        private static Stereotype MDAASSOCDEP;

        @objid ("e218945a-c7d4-4a50-9b9e-9c699f929ca0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bb596819-1f1c-4601-b467-b2698b8c14ec")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db57e13c-0cce-11df-8525-001302895b2b");
            TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db662f28-0cce-11df-8525-001302895b2b");
            TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db662f29-0cce-11df-8525-001302895b2b");
            TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db662f2a-0cce-11df-8525-001302895b2b");
            TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bb414f81-c7fd-11e0-9823-0027103f347c");
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
