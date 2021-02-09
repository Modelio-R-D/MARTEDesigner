/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.callaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CallAction} with << RtFeature_CallAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtFeatureCallAction {
    public static final String STEREOTYPE_NAME = "RtFeature_CallAction";

    public static final String RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE = "RtFeature_CallAction_specification";

    /**
     * The underlying {@link CallAction} represented by this proxy, never null.
     */
    protected final CallAction elt;

    /**
     * Tells whether a {@link RtFeatureCallAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallAction} stereotyped << RtFeature_CallAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallAction) && ((CallAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureCallAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallAction} stereotyped << RtFeature_CallAction >> then instantiate a {@link RtFeatureCallAction} proxy.
     * 
     * @return a {@link RtFeatureCallAction} proxy on the created {@link CallAction}.
     */
    public static RtFeatureCallAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CallAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureCallAction.STEREOTYPE_NAME);
        return RtFeatureCallAction.instantiate((CallAction)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureCallAction} proxy from a {@link CallAction} stereotyped << RtFeature_CallAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallAction
     * @return a {@link RtFeatureCallAction} proxy or <i>null</i>.
     */
    public static RtFeatureCallAction instantiate(final CallAction obj) {
        return RtFeatureCallAction.canInstantiate(obj) ? new RtFeatureCallAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeatureCallAction} proxy from a {@link CallAction} stereotyped << RtFeature_CallAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CallAction}
     * @return a {@link RtFeatureCallAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtFeatureCallAction safeInstantiate(final CallAction obj) throws IllegalArgumentException {
        if (RtFeatureCallAction.canInstantiate(obj))
        	return new RtFeatureCallAction(obj);
        else
        	throw new IllegalArgumentException("RtFeatureCallAction: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtFeatureCallAction other = (RtFeatureCallAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CallAction}. 
     * @return the CallAction represented by this proxy, never null.
     */
    public CallAction getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_CallAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public String getRtFeature_CallAction_specificationNote() {
        return this.elt.getNoteContent(RtFeatureCallAction.MdaTypes.RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_CallAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public void setRtFeature_CallAction_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureCallAction.MdaTypes.RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE_ELT, value);
    }

    protected RtFeatureCallAction(final CallAction elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static NoteType RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "67430ee5-0ff8-11df-86fe-0014222a9f79");
            RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "047dc008-9276-11e0-aeeb-0027103f347c");
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
