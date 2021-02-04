/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("a32147c3-7360-4239-8c52-a29abf14b044")
    public static final String STEREOTYPE_NAME = "TimedProcessing_ActivityAction";

    @objid ("992f67f8-a9fc-4076-bd4e-660c5170c8bd")
    public static final String TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE = "TimedProcessing_ActivityAction_duration";

    @objid ("fab01b2c-01ea-48ba-bcc4-657784d75b95")
    public static final String TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE = "TimedProcessing_ActivityAction_finish";

    @objid ("43bea8cf-a3ab-4e98-8b70-cefba4d2482c")
    public static final String TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE = "TimedProcessing_ActivityAction_on";

    @objid ("ce8c4455-ce29-4090-be1e-31387bc1857b")
    public static final String TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE = "TimedProcessing_ActivityAction_start";

    /**
     * The underlying {@link ActivityAction} represented by this proxy, never null.
     */
    @objid ("df81fa6c-8a4d-45c2-8b12-1d3b1833c6ad")
    protected final ActivityAction elt;

    /**
     * Tells whether a {@link TimedProcessingActivityAction proxy} can be instantiated from a {@link MObject} checking it is a {@link ActivityAction} stereotyped << TimedProcessing_ActivityAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("72f3ffb6-ad74-4420-9c58-ccebdae71970")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ActivityAction) && ((ActivityAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingActivityAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ActivityAction} stereotyped << TimedProcessing_ActivityAction >> then instantiate a {@link TimedProcessingActivityAction} proxy.
     * 
     * @return a {@link TimedProcessingActivityAction} proxy on the created {@link ActivityAction}.
     */
    @objid ("0d875fe8-a53e-42d0-9745-89b7ca9e98ef")
    public static TimedProcessingActivityAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ActivityAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingActivityAction.STEREOTYPE_NAME);
        return TimedProcessingActivityAction.instantiate((ActivityAction)e);
    }

    /**
     * Tries to instantiate a {@link TimedProcessingActivityAction} proxy from a {@link ActivityAction} stereotyped << TimedProcessing_ActivityAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ActivityAction
     * @return a {@link TimedProcessingActivityAction} proxy or <i>null</i>.
     */
    @objid ("121bd0da-52bf-4044-a55d-aa4e6d56d982")
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
    @objid ("eb442fad-75e9-4a4d-97af-f026c6c82c04")
    public static TimedProcessingActivityAction safeInstantiate(final ActivityAction obj) throws IllegalArgumentException {
        if (TimedProcessingActivityAction.canInstantiate(obj))
        	return new TimedProcessingActivityAction(obj);
        else
        	throw new IllegalArgumentException("TimedProcessingActivityAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("13fbd777-9e03-49d5-ad48-886eab4ac4a3")
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
    @objid ("a6f83faf-c491-49a7-aa9b-2fc3489a7514")
    public ActivityAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedProcessing_ActivityAction_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e377d12c-6c83-4bd4-a92a-5e4dd15011a9")
    public String getTimedProcessing_ActivityAction_duration() {
        return this.elt.getTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_ActivityAction_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f10ace9f-aaea-414b-933c-d6c179ee056b")
    public String getTimedProcessing_ActivityAction_finish() {
        return this.elt.getTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedProcessing_ActivityAction_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ff4d79ea-2cfc-4220-b1ca-71dba9dd4cd7")
    public List<String> getTimedProcessing_ActivityAction_on() {
        return this.elt.getTagValues(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_ActivityAction_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e9147188-0eaa-4133-9b82-4c994d7e02f0")
    public String getTimedProcessing_ActivityAction_start() {
        return this.elt.getTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE_ELT);
    }

    @objid ("fc299a08-22e6-4ad3-9ad5-1394e2d90e0b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedProcessing_ActivityAction_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("308f52e9-a62b-4450-bf04-4caeed68f1ab")
    public void setTimedProcessing_ActivityAction_duration(final String value) {
        this.elt.putTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'TimedProcessing_ActivityAction_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7242c115-3594-4441-90d4-c5a214591f32")
    public void setTimedProcessing_ActivityAction_finish(final String value) {
        this.elt.putTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedProcessing_ActivityAction_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("769ac574-869e-4549-940e-da881781d1c1")
    public void setTimedProcessing_ActivityAction_on(final List<String> values) {
        this.elt.putTagValues(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'TimedProcessing_ActivityAction_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e48a4e09-841e-4fce-9ed6-870f6597d9dd")
    public void setTimedProcessing_ActivityAction_start(final String value) {
        this.elt.putTagValue(TimedProcessingActivityAction.MdaTypes.TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE_ELT, value);
    }

    @objid ("d1318973-608c-4f2a-8ea2-cdfdfd05912b")
    protected TimedProcessingActivityAction(final ActivityAction elt) {
        this.elt = elt;
    }

    @objid ("b108101f-458c-430d-94ed-7416339591bf")
    public static final class MdaTypes {
        @objid ("7aa35193-417a-40b0-87af-f78c7ac822ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c013df68-a0c2-4042-b8ac-68d318b9aff4")
        public static TagType TIMEDPROCESSING_ACTIVITYACTION_DURATION_TAGTYPE_ELT;

        @objid ("b4995826-4801-435b-bbfb-39795c339ee1")
        public static TagType TIMEDPROCESSING_ACTIVITYACTION_START_TAGTYPE_ELT;

        @objid ("fced7e02-e62d-474a-9427-c4e026e64818")
        public static TagType TIMEDPROCESSING_ACTIVITYACTION_FINISH_TAGTYPE_ELT;

        @objid ("3daff3d6-b76e-4c84-86b0-0595961cb42c")
        public static TagType TIMEDPROCESSING_ACTIVITYACTION_ON_TAGTYPE_ELT;

        @objid ("f389f0b6-ce07-48d8-ae51-aaa4a08ee94a")
        private static Stereotype MDAASSOCDEP;

        @objid ("732ec49a-241a-4758-950e-e3b4efbb9337")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4d192e07-feff-47a8-a5c0-7ae37ae69732")
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
