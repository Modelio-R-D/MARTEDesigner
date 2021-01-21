/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << Acquire_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("20274f46-0e9f-4629-8bbf-ae6cbe4b0c27")
public class AcquireBehavior extends GrServiceBehavior {
    @objid ("966deaa2-118e-4ac4-a5b2-cac564dedabb")
    public static final String STEREOTYPE_NAME = "Acquire_Behavior";

    @objid ("83e6927e-76a2-4a71-804b-3c3856c4109c")
    public static final String ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE = "Acquire_Behavior_isBlocking";

    /**
     * Tells whether a {@link AcquireBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << Acquire_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f990693b-b037-4437-a799-a6c295571738")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, AcquireBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << Acquire_Behavior >> then instantiate a {@link AcquireBehavior} proxy.
     * 
     * @return a {@link AcquireBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("6eff2a20-7dc8-464d-b6b7-073ffa6c4e78")
    public static AcquireBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, AcquireBehavior.STEREOTYPE_NAME);
        return AcquireBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link AcquireBehavior} proxy from a {@link Behavior} stereotyped << Acquire_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link AcquireBehavior} proxy or <i>null</i>.
     */
    @objid ("2ae0bdc3-180c-483c-b0d6-84fda583eff3")
    public static AcquireBehavior instantiate(final Behavior obj) {
        return AcquireBehavior.canInstantiate(obj) ? new AcquireBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AcquireBehavior} proxy from a {@link Behavior} stereotyped << Acquire_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link AcquireBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("64392ab5-759e-468d-822f-c4770bb86694")
    public static AcquireBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (AcquireBehavior.canInstantiate(obj))
        	return new AcquireBehavior(obj);
        else
        	throw new IllegalArgumentException("AcquireBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("17824a90-0796-48c7-bbfd-d7c4b0e2076b")
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
        AcquireBehavior other = (AcquireBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("44d5308b-253e-4544-9c31-0e7411189a52")
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    @objid ("48e7e425-1d48-4712-aa7d-30c1e386cbdc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Acquire_Behavior_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ea23864-29ab-4c2c-921c-fc222f89adc5")
    public boolean isAcquire_Behavior_isBlocking() {
        return this.elt.isTagged(AcquireBehavior.MdaTypes.ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Acquire_Behavior_isBlocking'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce681b28-cf34-4d5a-8781-398058421197")
    public void setAcquire_Behavior_isBlocking(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(AcquireBehavior.MdaTypes.ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(AcquireBehavior.MdaTypes.ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT);
    }

    @objid ("1604d8d6-37c8-4986-87e1-364100ade0d6")
    protected AcquireBehavior(final Behavior elt) {
        super(elt);
    }

    @objid ("0ef510e2-15c2-4bd0-8890-d68d5e887bea")
    public static final class MdaTypes {
        @objid ("9bd0d78b-7929-40a4-bb78-249c1f0e653f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ba0af4a2-3a54-40b7-9b1d-332e90b9c0eb")
        public static TagType ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT;

        @objid ("338e9f52-c5f7-41a7-86ce-6c79ae6538c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("a8e22d91-de19-4497-b889-90fbffcc5443")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48598954-0757-4775-a2e2-ce00b24ce3b8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ab3511-0ccf-11df-8525-001302895b2b");
            ACQUIRE_BEHAVIOR_ISBLOCKING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00ad975f-0ccf-11df-8525-001302895b2b");
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
