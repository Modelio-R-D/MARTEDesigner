/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CallAction} with << RtAction_CallAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("eb5b2e96-a071-4afb-84c5-e784e24ddc7f")
public class RtActionCallAction {
    @objid ("b44ecfa4-8cef-404d-be90-297fa2edf00f")
    public static final String STEREOTYPE_NAME = "RtAction_CallAction";

    @objid ("017c59e5-e64d-41cb-be45-728062779ec8")
    public static final String RTACTION_CALLACTION_ISATOMIC_TAGTYPE = "RtAction_CallAction_isAtomic";

    @objid ("d8a5b1d9-8da9-4f54-adfb-d941bf442844")
    public static final String RTACTION_CALLACTION_MSGSIZE_TAGTYPE = "RtAction_CallAction_msgSize";

    @objid ("f8de3f89-083b-4c28-a6a4-c4f62f5dcbaf")
    public static final String RTACTION_CALLACTION_SYNCHKIND_TAGTYPE = "RtAction_CallAction_synchKind";

    /**
     * The underlying {@link CallAction} represented by this proxy, never null.
     */
    @objid ("8fca1bb6-e705-4a5c-99a6-f1fc569812e4")
    protected final CallAction elt;

    /**
     * Tells whether a {@link RtActionCallAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallAction} stereotyped << RtAction_CallAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5e9acaf7-6688-400e-84f5-744fead25c1a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallAction) && ((CallAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionCallAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallAction} stereotyped << RtAction_CallAction >> then instantiate a {@link RtActionCallAction} proxy.
     * 
     * @return a {@link RtActionCallAction} proxy on the created {@link CallAction}.
     */
    @objid ("466c0bf6-9eda-45be-873a-93e716a4b283")
    public static RtActionCallAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CallAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionCallAction.STEREOTYPE_NAME);
        return RtActionCallAction.instantiate((CallAction)e);
    }

    /**
     * Tries to instantiate a {@link RtActionCallAction} proxy from a {@link CallAction} stereotyped << RtAction_CallAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallAction
     * @return a {@link RtActionCallAction} proxy or <i>null</i>.
     */
    @objid ("c291a146-3043-41ef-9b0e-c7af4264c62e")
    public static RtActionCallAction instantiate(final CallAction obj) {
        return RtActionCallAction.canInstantiate(obj) ? new RtActionCallAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtActionCallAction} proxy from a {@link CallAction} stereotyped << RtAction_CallAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CallAction}
     * @return a {@link RtActionCallAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("77d54dc4-8ea9-4b21-ab8f-941d5496aa2d")
    public static RtActionCallAction safeInstantiate(final CallAction obj) throws IllegalArgumentException {
        if (RtActionCallAction.canInstantiate(obj))
        	return new RtActionCallAction(obj);
        else
        	throw new IllegalArgumentException("RtActionCallAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("51416b33-eb53-4a77-8c7d-51efa85c3384")
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
        RtActionCallAction other = (RtActionCallAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CallAction}. 
     * @return the CallAction represented by this proxy, never null.
     */
    @objid ("7c15a82f-1d18-4823-8b7c-6a1613b44e7f")
    public CallAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtAction_CallAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49d4af95-0246-42df-b18f-a1e67f7759bd")
    public String getRtAction_CallAction_msgSize() {
        return this.elt.getTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_CallAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd313e46-1e5e-4be2-aacd-af19cebf49aa")
    public String getRtAction_CallAction_synchKind() {
        return this.elt.getTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT);
    }

    @objid ("f7e162be-804e-49bd-99d3-cbaccf45eb48")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_CallAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b8d4541d-17f9-4bbd-b8f4-3889c9a4e3d5")
    public boolean isRtAction_CallAction_isAtomic() {
        return this.elt.isTagged(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_CallAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("26ae55af-aa64-4a05-baae-e571c4add6ae")
    public void setRtAction_CallAction_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtAction_CallAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d1a680e9-8324-45aa-8083-534a281c2d5e")
    public void setRtAction_CallAction_msgSize(final String value) {
        this.elt.putTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_CallAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("85c84f52-bb88-42d7-9df5-5a6bfed2b30e")
    public void setRtAction_CallAction_synchKind(final String value) {
        this.elt.putTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    @objid ("d5e89cb3-e8ca-4312-9bf1-04c2d63f8912")
    protected RtActionCallAction(final CallAction elt) {
        this.elt = elt;
    }

    @objid ("c7565de3-4852-4ec1-a735-963d87917524")
    public static final class MdaTypes {
        @objid ("47227685-d003-493d-ad06-f10c7ce31135")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cd78b1af-8e96-4c52-a3f3-7d8736543e7e")
        public static TagType RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT;

        @objid ("e36fce66-10f5-4b01-b48d-97ce9fb537bb")
        public static TagType RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT;

        @objid ("f946a6a7-ec19-4097-b1c0-72efdee9c163")
        public static TagType RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT;

        @objid ("aa99183e-63e0-4f3f-8cd6-bb53c574b7ea")
        private static Stereotype MDAASSOCDEP;

        @objid ("f7103f5c-b3b4-4ed8-91e2-2ecfa455a8eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("405d6c09-6119-46e0-8141-5433c66d8aab")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a13ac171-0ff9-11df-86fe-0014222a9f79");
            RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ada74cd9-0ff9-11df-86fe-0014222a9f79");
            RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "60d761a6-1237-11df-8f55-0014222a9f79");
            RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "60d761a7-1237-11df-8f55-0014222a9f79");
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
