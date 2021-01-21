/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.opaqueaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
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
 * Proxy class to handle a {@link OpaqueAction} with << RtAction_OpaqueAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4f130e7f-0f36-4a7f-85b7-2ee28569e720")
public class RtActionOpaqueAction {
    @objid ("c54a27a3-0fc4-4e81-bc47-4f78a0c9363a")
    public static final String STEREOTYPE_NAME = "RtAction_OpaqueAction";

    @objid ("53d58c2a-b2d6-4994-a3de-352cd2f14808")
    public static final String RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE = "RtAction_OpaqueAction_isAtomic";

    @objid ("4c9d1491-9a95-487c-93ba-b921987b184f")
    public static final String RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE = "RtAction_OpaqueAction_msgSize";

    @objid ("4ba77762-5508-40f1-89ab-79fcde9a2db1")
    public static final String RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE = "RtAction_OpaqueAction_synchKind";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("01f61ff5-b4c2-41ae-b72c-c6f4df2794ce")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link RtActionOpaqueAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << RtAction_OpaqueAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("129612c6-a4d5-4408-9f54-016b5fd90688")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionOpaqueAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << RtAction_OpaqueAction >> then instantiate a {@link RtActionOpaqueAction} proxy.
     * 
     * @return a {@link RtActionOpaqueAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("b616386f-bb09-4caa-92fe-d209dd1f65eb")
    public static RtActionOpaqueAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("OpaqueAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionOpaqueAction.STEREOTYPE_NAME);
        return RtActionOpaqueAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link RtActionOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << RtAction_OpaqueAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link RtActionOpaqueAction} proxy or <i>null</i>.
     */
    @objid ("e0e84140-7584-4062-915b-6b1063eb1b73")
    public static RtActionOpaqueAction instantiate(final OpaqueAction obj) {
        return RtActionOpaqueAction.canInstantiate(obj) ? new RtActionOpaqueAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtActionOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << RtAction_OpaqueAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link RtActionOpaqueAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ae143702-4c14-49f0-8840-725824023c77")
    public static RtActionOpaqueAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (RtActionOpaqueAction.canInstantiate(obj))
        	return new RtActionOpaqueAction(obj);
        else
        	throw new IllegalArgumentException("RtActionOpaqueAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("54f41209-dbcf-45b4-8a79-81a81f31361f")
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
        RtActionOpaqueAction other = (RtActionOpaqueAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("2d9ef1f4-7aa3-42db-a8c0-9935373e4c5a")
    public OpaqueAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtAction_OpaqueAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac45dcef-30a7-4a20-ac7c-0f0776e8ab78")
    public String getRtAction_OpaqueAction_msgSize() {
        return this.elt.getTagValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_OpaqueAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c8ac6d5-6a7d-4b2b-96b2-67bc0c6a284b")
    public String getRtAction_OpaqueAction_synchKind() {
        return this.elt.getTagValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE_ELT);
    }

    @objid ("41158896-899d-4156-bd1a-58b2c85b260e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_OpaqueAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6a7d6224-4782-4fd0-9205-8da766634a6e")
    public boolean isRtAction_OpaqueAction_isAtomic() {
        return this.elt.isTagged(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_OpaqueAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59317667-cab1-454d-b90b-56cbb3062c24")
    public void setRtAction_OpaqueAction_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtAction_OpaqueAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ea47cc15-54e3-4f85-9740-ee85401a4357")
    public void setRtAction_OpaqueAction_msgSize(final String value) {
        this.elt.putTagValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_OpaqueAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("700bf67e-1768-474e-ac81-743a6dbf17b6")
    public void setRtAction_OpaqueAction_synchKind(final String value) {
        this.elt.putTagValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    @objid ("a713a19c-a7ca-4a1e-9e3a-80e7a9d2f47b")
    protected RtActionOpaqueAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("78635a33-301a-4ec4-86fa-b6f7f4ce0e2c")
    public static final class MdaTypes {
        @objid ("b66d3a8b-131b-42db-b0dc-15f8a47adec0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eed145e0-cbc9-4757-bdf6-03412016ecb6")
        public static TagType RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT;

        @objid ("bd8e6c7d-ccb0-4278-b799-dc73e4f1bd40")
        public static TagType RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE_ELT;

        @objid ("6c7b5dc9-cfbe-4317-9c11-faba76d64707")
        public static TagType RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE_ELT;

        @objid ("f0581262-d740-4e7b-88ec-e4780256a299")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba0e92bf-3eb3-4834-b4fe-83704b932b37")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68f95fd9-1489-437a-a9cc-0b3b1d82b893")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "682d416d-14b3-11df-ad67-001302895b2b");
            RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "682d416e-14b3-11df-ad67-001302895b2b");
            RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "682d416f-14b3-11df-ad67-001302895b2b");
            RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "682d4170-14b3-11df-ad67-001302895b2b");
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
