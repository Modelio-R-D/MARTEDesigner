/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("c259edbf-8aba-4e23-aff7-cca761765d17")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_demand_GaWorkloadEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("48a020a6-3d5d-431d-a67f-44da3209d9de")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDemandGaWorkloadEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_demand_GaWorkloadEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1117d7de-1060-45a1-8b05-ab24e5a3958e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDemandGaWorkloadEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_demand_GaWorkloadEvent >> then instantiate a {@link ProfileAssociationDemandGaWorkloadEvent} proxy.
     * 
     * @return a {@link ProfileAssociationDemandGaWorkloadEvent} proxy on the created {@link Dependency}.
     */
    @objid ("6dcbf87d-31b3-4349-9082-42d2ac7c3ad6")
    public static ProfileAssociationDemandGaWorkloadEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDemandGaWorkloadEvent.STEREOTYPE_NAME);
        return ProfileAssociationDemandGaWorkloadEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDemandGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_demand_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDemandGaWorkloadEvent} proxy or <i>null</i>.
     */
    @objid ("ed1dc04f-bf35-43d9-8cc0-5b01b992a7ab")
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
    @objid ("68974d63-165b-4a2c-9eab-b726767e2eae")
    public static ProfileAssociationDemandGaWorkloadEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDemandGaWorkloadEvent.canInstantiate(obj))
        	return new ProfileAssociationDemandGaWorkloadEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDemandGaWorkloadEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a9865d1-58bb-4442-a925-fe757b7e8803")
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
    @objid ("a3491bb3-8df8-4472-8293-8e047c6b9a61")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("78916f55-7702-4bd3-86c2-94f552ec1e58")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a976bd94-1cf9-45bb-a9a3-1163a2f86bd9")
    protected ProfileAssociationDemandGaWorkloadEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("905d1ff9-5f6b-4bda-9070-810eb60da5dc")
    public static final class MdaTypes {
        @objid ("6bf024a4-f950-4012-a912-3db79dbd0d28")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("363aa6c7-4b23-413a-b9b6-0198e3141ce1")
        private static Stereotype MDAASSOCDEP;

        @objid ("96f6fd00-a8a3-4224-b415-cacfeccba39a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ceb0a234-41e8-40cd-b345-5bf2621d9798")
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
