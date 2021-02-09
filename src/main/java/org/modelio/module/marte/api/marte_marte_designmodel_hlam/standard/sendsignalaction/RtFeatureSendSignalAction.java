/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.sendsignalaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
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
 * Proxy class to handle a {@link SendSignalAction} with << RtFeature_SendSignalAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtFeatureSendSignalAction {
    public static final String STEREOTYPE_NAME = "RtFeature_SendSignalAction";

    public static final String RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE = "RtFeature_SendSignalAction_specification";

    /**
     * The underlying {@link SendSignalAction} represented by this proxy, never null.
     */
    protected final SendSignalAction elt;

    /**
     * Tells whether a {@link RtFeatureSendSignalAction proxy} can be instantiated from a {@link MObject} checking it is a {@link SendSignalAction} stereotyped << RtFeature_SendSignalAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof SendSignalAction) && ((SendSignalAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureSendSignalAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link SendSignalAction} stereotyped << RtFeature_SendSignalAction >> then instantiate a {@link RtFeatureSendSignalAction} proxy.
     * 
     * @return a {@link RtFeatureSendSignalAction} proxy on the created {@link SendSignalAction}.
     */
    public static RtFeatureSendSignalAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.SendSignalAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureSendSignalAction.STEREOTYPE_NAME);
        return RtFeatureSendSignalAction.instantiate((SendSignalAction)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureSendSignalAction} proxy from a {@link SendSignalAction} stereotyped << RtFeature_SendSignalAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a SendSignalAction
     * @return a {@link RtFeatureSendSignalAction} proxy or <i>null</i>.
     */
    public static RtFeatureSendSignalAction instantiate(final SendSignalAction obj) {
        return RtFeatureSendSignalAction.canInstantiate(obj) ? new RtFeatureSendSignalAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeatureSendSignalAction} proxy from a {@link SendSignalAction} stereotyped << RtFeature_SendSignalAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link SendSignalAction}
     * @return a {@link RtFeatureSendSignalAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtFeatureSendSignalAction safeInstantiate(final SendSignalAction obj) throws IllegalArgumentException {
        if (RtFeatureSendSignalAction.canInstantiate(obj))
        	return new RtFeatureSendSignalAction(obj);
        else
        	throw new IllegalArgumentException("RtFeatureSendSignalAction: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtFeatureSendSignalAction other = (RtFeatureSendSignalAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link SendSignalAction}. 
     * @return the SendSignalAction represented by this proxy, never null.
     */
    public SendSignalAction getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_SendSignalAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public String getRtFeature_SendSignalAction_specificationNote() {
        return this.elt.getNoteContent(RtFeatureSendSignalAction.MdaTypes.RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_SendSignalAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public void setRtFeature_SendSignalAction_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureSendSignalAction.MdaTypes.RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE_ELT, value);
    }

    protected RtFeatureSendSignalAction(final SendSignalAction elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static NoteType RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3076f704-14b3-11df-ad67-001302895b2b");
            RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "1ae28044-9276-11e0-aeeb-0027103f347c");
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
