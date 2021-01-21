/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_demand_GaWorkloadEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b8c55422-7efe-4d6b-8c4f-90ab3e0d331f")
public class ProfileAssociationDemandGaWorkloadEvent {
    @objid ("b3483f80-70ab-4a67-89d0-bf35e3a668ce")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_demand_GaWorkloadEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("2d42f73a-2f83-4282-9917-3423087438e5")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDemandGaWorkloadEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_demand_GaWorkloadEvent >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("db2b8569-e75a-4625-8b88-5de797f8c9ed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDemandGaWorkloadEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_demand_GaWorkloadEvent >> then instantiate a {@link ProfileAssociationDemandGaWorkloadEvent} proxy.
     * 
     * @return a {@link ProfileAssociationDemandGaWorkloadEvent} proxy on the created {@link Dependency}.
     */
    @objid ("057b0acc-b343-4957-ab41-c5e44863a895")
    public static ProfileAssociationDemandGaWorkloadEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDemandGaWorkloadEvent.STEREOTYPE_NAME);
        return ProfileAssociationDemandGaWorkloadEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDemandGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_demand_GaWorkloadEvent >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDemandGaWorkloadEvent} proxy or <i>null</i>.
     */
    @objid ("ea1b0043-8a53-4a27-9035-407d490a4b09")
    public static ProfileAssociationDemandGaWorkloadEvent instantiate(final Dependency obj) {
        return ProfileAssociationDemandGaWorkloadEvent.canInstantiate(obj) ? new ProfileAssociationDemandGaWorkloadEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDemandGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_demand_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDemandGaWorkloadEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2718e9d7-695c-4bc6-80c1-f20694c155f9")
    public static ProfileAssociationDemandGaWorkloadEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDemandGaWorkloadEvent.canInstantiate(obj))
        	return new ProfileAssociationDemandGaWorkloadEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDemandGaWorkloadEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e487ade6-dfc4-4d44-ac98-4a48a6b59266")
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
        ProfileAssociationDemandGaWorkloadEvent other = (ProfileAssociationDemandGaWorkloadEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("d25b502a-21dd-4418-9d2a-3e99b64270f8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a487c631-1a5a-4413-b5f2-60d0bd9046d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("586fa445-4772-4a8e-9959-32408b2c0d8e")
    protected ProfileAssociationDemandGaWorkloadEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("905d1ff9-5f6b-4bda-9070-810eb60da5dc")
    public static final class MdaTypes {
        @objid ("d3a8d251-4853-4630-982f-6f3426717755")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("61dd2bff-59ba-4d72-b202-2b35898ae95a")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6846bd8-94e4-4134-9151-cab0cb787e7d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f5b64c1-4da0-44e3-9419-6dc36f95ab0a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cef694a3-dd1f-11e0-a2be-0027103f347c");
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
