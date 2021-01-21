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
    @objid ("982db621-adb8-4206-a6d2-05c7cfcfe333")
    public static final String STEREOTYPE_NAME = "RtAction_CallAction";

    @objid ("86d27f71-5c9f-4bc1-baa8-06764ac583b5")
    public static final String RTACTION_CALLACTION_ISATOMIC_TAGTYPE = "RtAction_CallAction_isAtomic";

    @objid ("0109fadd-c014-4e90-9a5c-bc1b3a960730")
    public static final String RTACTION_CALLACTION_MSGSIZE_TAGTYPE = "RtAction_CallAction_msgSize";

    @objid ("d2929632-6416-4b5f-9623-59d0f7f50ca0")
    public static final String RTACTION_CALLACTION_SYNCHKIND_TAGTYPE = "RtAction_CallAction_synchKind";

    /**
     * The underlying {@link CallAction} represented by this proxy, never null.
     */
    @objid ("0ec75443-ab6a-40b2-9ee5-3d45a6ab175d")
    protected final CallAction elt;

    /**
     * Tells whether a {@link RtActionCallAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallAction} stereotyped << RtAction_CallAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("316c112e-7be2-4694-aba9-94eb0128143e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallAction) && ((CallAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionCallAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallAction} stereotyped << RtAction_CallAction >> then instantiate a {@link RtActionCallAction} proxy.
     * 
     * @return a {@link RtActionCallAction} proxy on the created {@link CallAction}.
     */
    @objid ("cb5a664b-6c41-4a61-a33b-01111eeddb34")
    public static RtActionCallAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("CallAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionCallAction.STEREOTYPE_NAME);
        return RtActionCallAction.instantiate((CallAction)e);
    }

    /**
     * Tries to instantiate a {@link RtActionCallAction} proxy from a {@link CallAction} stereotyped << RtAction_CallAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallAction
     * @return a {@link RtActionCallAction} proxy or <i>null</i>.
     */
    @objid ("c0943a1b-213b-43aa-9871-ee2ff297f4fc")
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
    @objid ("0aab240b-4927-424b-ba91-2c30839c6f4f")
    public static RtActionCallAction safeInstantiate(final CallAction obj) throws IllegalArgumentException {
        if (RtActionCallAction.canInstantiate(obj))
        	return new RtActionCallAction(obj);
        else
        	throw new IllegalArgumentException("RtActionCallAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("870b13ad-563a-4c61-8c87-4a63424314ad")
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
    @objid ("f6d107bf-61f4-4e6c-8eff-fd288258f33d")
    public CallAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtAction_CallAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5006f62d-0b3f-4177-bdeb-795af4116b9e")
    public String getRtAction_CallAction_msgSize() {
        return this.elt.getTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_CallAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5285fd64-308f-49f2-aa76-92be9cc23b29")
    public String getRtAction_CallAction_synchKind() {
        return this.elt.getTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT);
    }

    @objid ("ed45ea6c-51ad-4eaa-aba0-c0805d2138af")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_CallAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("934ea130-626b-49b3-82be-7c6f9603629e")
    public boolean isRtAction_CallAction_isAtomic() {
        return this.elt.isTagged(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_CallAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("77427d8c-f06b-4a84-b239-f90924d09e40")
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
    @objid ("095c1588-623e-4c69-a99a-d11049358e67")
    public void setRtAction_CallAction_msgSize(final String value) {
        this.elt.putTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_CallAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f0d2ed9a-68f8-4150-890e-6d10809ef927")
    public void setRtAction_CallAction_synchKind(final String value) {
        this.elt.putTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    @objid ("568f68c4-d057-4701-93e5-c3bd8db28e1d")
    protected RtActionCallAction(final CallAction elt) {
        this.elt = elt;
    }

    @objid ("c7565de3-4852-4ec1-a735-963d87917524")
    public static final class MdaTypes {
        @objid ("3ca14ca1-93ad-4354-b1e1-145aa03d0667")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("40c5effd-f6a6-42f3-8ce1-d404d0873182")
        public static TagType RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT;

        @objid ("b10da793-a422-43ef-86b0-946a62441d74")
        public static TagType RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT;

        @objid ("b529da9c-a9d5-4685-8414-a683db22cfcc")
        public static TagType RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT;

        @objid ("6276ff99-8737-4bf0-882f-1f31a23e06ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa6dc032-cc51-4a72-ae75-929414461e90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("addc8900-f7ea-4cf2-80df-dd2b3baad120")
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
