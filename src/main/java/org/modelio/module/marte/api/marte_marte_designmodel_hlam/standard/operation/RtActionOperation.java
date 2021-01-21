/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << RtAction_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d6b5ffb5-938c-45b3-965d-fae18eeb166e")
public class RtActionOperation {
    @objid ("3bdac30e-9d7f-4a87-9c26-5afd8a026e53")
    public static final String STEREOTYPE_NAME = "RtAction_Operation";

    @objid ("29f064a5-0a96-429d-8dce-0b2bff34a889")
    public static final String RTACTION_OPERATION_ISATOMIC_TAGTYPE = "RtAction_Operation_isAtomic";

    @objid ("d9e2170f-3379-43fb-b773-2d1de17585dc")
    public static final String RTACTION_OPERATION_MSGSIZE_TAGTYPE = "RtAction_Operation_msgSize";

    @objid ("e3b01562-3ecd-4ced-882a-7d2c53eb3b53")
    public static final String RTACTION_OPERATION_SYNCHKIND_TAGTYPE = "RtAction_Operation_synchKind";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    @objid ("a4665cd9-27f9-45b7-9c38-82a6d8cc1c22")
    protected final Operation elt;

    /**
     * Tells whether a {@link RtActionOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << RtAction_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e6472736-7686-4bc6-8f6e-1877c7176186")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << RtAction_Operation >> then instantiate a {@link RtActionOperation} proxy.
     * 
     * @return a {@link RtActionOperation} proxy on the created {@link Operation}.
     */
    @objid ("211c434f-2ee7-4f80-8e8a-71a6f8c57071")
    public static RtActionOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionOperation.STEREOTYPE_NAME);
        return RtActionOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link RtActionOperation} proxy from a {@link Operation} stereotyped << RtAction_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link RtActionOperation} proxy or <i>null</i>.
     */
    @objid ("91f1e8c7-bdeb-4419-b852-0cc66dc81f76")
    public static RtActionOperation instantiate(final Operation obj) {
        return RtActionOperation.canInstantiate(obj) ? new RtActionOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtActionOperation} proxy from a {@link Operation} stereotyped << RtAction_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link RtActionOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d09425a3-4bf7-45d1-be5a-8db564617aa1")
    public static RtActionOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (RtActionOperation.canInstantiate(obj))
        	return new RtActionOperation(obj);
        else
        	throw new IllegalArgumentException("RtActionOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7ce8d4ac-e53e-419d-97ad-7494c78a4fe5")
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
        RtActionOperation other = (RtActionOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("2ddbe673-ded6-4d7b-8864-3b1b5159db92")
    public Operation getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtAction_Operation_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d4e36bc-6b23-405b-8e31-73440e2f57cb")
    public String getRtAction_Operation_msgSize() {
        return this.elt.getTagValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_Operation_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2807aa1-e48f-4b79-b981-23c578061512")
    public String getRtAction_Operation_synchKind() {
        return this.elt.getTagValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_SYNCHKIND_TAGTYPE_ELT);
    }

    @objid ("f1efef61-128d-4095-a273-0784a00d2e10")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_Operation_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("870cb93d-726a-45ef-b89d-3d9bfb66074c")
    public boolean isRtAction_Operation_isAtomic() {
        return this.elt.isTagged(RtActionOperation.MdaTypes.RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_Operation_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e8285ba-f337-43c1-a797-9d73d44fb604")
    public void setRtAction_Operation_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtActionOperation.MdaTypes.RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtAction_Operation_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("516fe12e-a10b-41b5-aed6-c70d66e93d72")
    public void setRtAction_Operation_msgSize(final String value) {
        this.elt.putTagValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_Operation_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fd30b027-51ef-475b-8279-a79122770678")
    public void setRtAction_Operation_synchKind(final String value) {
        this.elt.putTagValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    @objid ("dfb34feb-1c7d-4a23-a089-aece47d5277f")
    protected RtActionOperation(final Operation elt) {
        this.elt = elt;
    }

    @objid ("37dc33f4-5970-4480-ac62-1c756ff25944")
    public static final class MdaTypes {
        @objid ("f3b33d86-eb63-489c-be02-cd34d47b6ad1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8eb1566b-c3f8-4023-a8c6-d54a2800565a")
        public static TagType RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT;

        @objid ("665b7853-12c0-4fa4-8807-985e68a68d0c")
        public static TagType RTACTION_OPERATION_SYNCHKIND_TAGTYPE_ELT;

        @objid ("0c13a5a7-108e-49da-bbb8-488774f3c98f")
        public static TagType RTACTION_OPERATION_MSGSIZE_TAGTYPE_ELT;

        @objid ("9323b5b6-5f08-420f-ba55-b7fb42960b09")
        private static Stereotype MDAASSOCDEP;

        @objid ("29a1ff1c-7cde-4e69-8676-ecae4e93313e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a71513b1-d105-45c4-aa7c-fc3d330e9300")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00cef7db-0ccf-11df-8525-001302895b2b");
            RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00cef7dc-0ccf-11df-8525-001302895b2b");
            RTACTION_OPERATION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d2a9866-1237-11df-8f55-0014222a9f79");
            RTACTION_OPERATION_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "52f39507-1237-11df-8f55-0014222a9f79");
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
