/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.callaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("892b7246-6cf5-4ded-9d2a-890f0f9dfc56")
public class RtFeatureCallAction {
    @objid ("371940b0-3da6-4222-a010-70b7aa750c85")
    public static final String STEREOTYPE_NAME = "RtFeature_CallAction";

    @objid ("6cda27fc-915c-400e-80ca-f751cc35a036")
    public static final String RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE = "RtFeature_CallAction_specification";

    /**
     * The underlying {@link CallAction} represented by this proxy, never null.
     */
    @objid ("d0c5a5ef-68a5-4995-be95-5b86375961be")
    protected final CallAction elt;

    /**
     * Tells whether a {@link RtFeatureCallAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallAction} stereotyped << RtFeature_CallAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0c6e0af2-fa23-4bf1-b00f-ef9e83eda968")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallAction) && ((CallAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureCallAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallAction} stereotyped << RtFeature_CallAction >> then instantiate a {@link RtFeatureCallAction} proxy.
     * 
     * @return a {@link RtFeatureCallAction} proxy on the created {@link CallAction}.
     */
    @objid ("5d362c64-03bc-4a50-b620-47e115252b38")
    public static RtFeatureCallAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("CallAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureCallAction.STEREOTYPE_NAME);
        return RtFeatureCallAction.instantiate((CallAction)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureCallAction} proxy from a {@link CallAction} stereotyped << RtFeature_CallAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallAction
     * @return a {@link RtFeatureCallAction} proxy or <i>null</i>.
     */
    @objid ("b78beef0-91f2-4390-9f03-fcaf47a46fcc")
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
    @objid ("d6f870cb-a409-4e35-b55a-d1798ab64cb0")
    public static RtFeatureCallAction safeInstantiate(final CallAction obj) throws IllegalArgumentException {
        if (RtFeatureCallAction.canInstantiate(obj))
        	return new RtFeatureCallAction(obj);
        else
        	throw new IllegalArgumentException("RtFeatureCallAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8785b061-40d5-49b6-b63a-273b784a054c")
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
    @objid ("4bfdace4-2998-44be-bcde-4fcb98e2652f")
    public CallAction getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_CallAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("5f9da540-f935-44f0-8d40-54944541d052")
    public String getRtFeature_CallAction_specificationNote() {
        return this.elt.getNoteContent(RtFeatureCallAction.MdaTypes.RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE_ELT);
    }

    @objid ("143e1cac-7a31-4a03-be87-34c93c4832ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_CallAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("314c4ad6-4212-4006-988a-0fb2a1d177a1")
    public void setRtFeature_CallAction_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureCallAction.MdaTypes.RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE_ELT, value);
    }

    @objid ("4678b84f-df7e-4694-8cd2-e8cdec3be280")
    protected RtFeatureCallAction(final CallAction elt) {
        this.elt = elt;
    }

    @objid ("95f7b150-2a1e-4265-9eab-d7ceb931269c")
    public static final class MdaTypes {
        @objid ("5340b3c9-f96b-4ff6-a8bb-377aaa06cf50")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4e1f7108-abbf-47d2-83a9-64cf7bc59436")
        public static NoteType RTFEATURE_CALLACTION_SPECIFICATION_NOTETYPE_ELT;

        @objid ("3e0948a9-faab-4563-b3b8-8cfff35c7092")
        private static Stereotype MDAASSOCDEP;

        @objid ("6c22f389-1aff-4fc3-b996-6832dce75bc6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("79de3d83-335b-49a3-bf60-0fe7e80704fd")
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
