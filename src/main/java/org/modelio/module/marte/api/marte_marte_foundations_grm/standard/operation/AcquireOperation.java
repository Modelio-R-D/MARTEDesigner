/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.operation;

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
 * Proxy class to handle a {@link Operation} with << Acquire_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b6774fdc-8648-4bad-a14f-c1a53bb99cdc")
public class AcquireOperation extends GrServiceOperation {
    @objid ("8eab8b5c-2a59-431c-9ded-7e73a764a6ea")
    public static final String STEREOTYPE_NAME = "Acquire_Operation";

    @objid ("3ecff0ff-2ee7-4104-923d-ead464b4ce7f")
    public static final String ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE = "Acquire_Operation_isBlocking";

    /**
     * Tells whether a {@link AcquireOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << Acquire_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3933f406-347e-45d5-92a4-97320b9fec98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << Acquire_Operation >> then instantiate a {@link AcquireOperation} proxy.
     * 
     * @return a {@link AcquireOperation} proxy on the created {@link Operation}.
     */
    @objid ("a169d9b6-4de7-4432-9f59-0e931d6478be")
    public static AcquireOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireOperation.STEREOTYPE_NAME);
        return AcquireOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link AcquireOperation} proxy from a {@link Operation} stereotyped << Acquire_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link AcquireOperation} proxy or <i>null</i>.
     */
    @objid ("94a2eb38-84b7-44f5-9ed7-8f10e3cbc5ee")
    public static AcquireOperation instantiate(final Operation obj) {
        return AcquireOperation.canInstantiate(obj) ? new AcquireOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AcquireOperation} proxy from a {@link Operation} stereotyped << Acquire_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link AcquireOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("01dc5bc3-4394-4a20-95a5-ebdb502192bb")
    public static AcquireOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (AcquireOperation.canInstantiate(obj))
        	return new AcquireOperation(obj);
        else
        	throw new IllegalArgumentException("AcquireOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aad3ee62-e21c-4e90-8f2d-d299c733c6f7")
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
        AcquireOperation other = (AcquireOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    @objid ("8e8e92a8-33c2-47ec-8993-2cfe2d930dc4")
    @Override
    public Operation getElement() {
        return (Operation)super.getElement();
    }

    @objid ("49cfd020-d4d1-4eb5-b8d9-98f13d9e7f41")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_Operation_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ae2078f-f299-4cd2-a7b4-573b0018a326")
    public boolean isAcquire_Operation_isBlocking() {
        return this.elt.isTagged(AcquireOperation.MdaTypes.ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_Operation_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21163930-2487-491c-88dd-31364daf22d9")
    public void setAcquire_Operation_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireOperation.MdaTypes.ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireOperation.MdaTypes.ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT);
    }

    @objid ("cc10a412-d874-41dd-b929-8c28597e811a")
    protected AcquireOperation(final Operation elt) {
        super(elt);
    }

    @objid ("0790c2f8-a188-4a7d-81bc-04d33123cb00")
    public static final class MdaTypes {
        @objid ("8792f09d-f88b-48b1-ab06-35a618a2d597")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("27e17d37-fe98-4260-93fa-29d561f86c2a")
        public static TagType ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT;

        @objid ("79b35b1a-4919-4abc-bd64-2ab744b5598e")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c4dd007-2e6b-4da1-b836-c8d35be675e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("83aaf8c4-19f0-4d5b-8223-ebc45127ddaa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ab3510-0ccf-11df-8525-001302895b2b");
            ACQUIRE_OPERATION_ISBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad975e-0ccf-11df-8525-001302895b2b");
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
