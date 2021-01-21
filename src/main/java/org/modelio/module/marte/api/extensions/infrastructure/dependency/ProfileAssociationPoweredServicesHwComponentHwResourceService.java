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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_poweredServices_HwComponent_HwResourceService >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("361b9501-d66d-43fc-89af-284e4a67d98e")
public class ProfileAssociationPoweredServicesHwComponentHwResourceService {
    @objid ("3ac14e23-69b8-47a0-afce-b79295d4a900")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_poweredServices_HwComponent_HwResourceService";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("3b660675-0d9f-43d2-948c-7bc051a3a839")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPoweredServicesHwComponentHwResourceService proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_poweredServices_HwComponent_HwResourceService >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8bed8482-6c8f-4485-b92f-8fe513815113")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPoweredServicesHwComponentHwResourceService.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_poweredServices_HwComponent_HwResourceService >> then instantiate a {@link ProfileAssociationPoweredServicesHwComponentHwResourceService} proxy.
     * 
     * @return a {@link ProfileAssociationPoweredServicesHwComponentHwResourceService} proxy on the created {@link Dependency}.
     */
    @objid ("87cbeb5f-88df-4372-8422-280ca8f38c89")
    public static ProfileAssociationPoweredServicesHwComponentHwResourceService create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPoweredServicesHwComponentHwResourceService.STEREOTYPE_NAME);
        return ProfileAssociationPoweredServicesHwComponentHwResourceService.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPoweredServicesHwComponentHwResourceService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_poweredServices_HwComponent_HwResourceService >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPoweredServicesHwComponentHwResourceService} proxy or <i>null</i>.
     */
    @objid ("02bd264e-e440-4192-8be4-87b2535d596c")
    public static ProfileAssociationPoweredServicesHwComponentHwResourceService instantiate(final Dependency obj) {
        return ProfileAssociationPoweredServicesHwComponentHwResourceService.canInstantiate(obj) ? new ProfileAssociationPoweredServicesHwComponentHwResourceService(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPoweredServicesHwComponentHwResourceService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_poweredServices_HwComponent_HwResourceService >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationPoweredServicesHwComponentHwResourceService} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d27b6f88-852c-4911-8c4a-3dfa909a8a5a")
    public static ProfileAssociationPoweredServicesHwComponentHwResourceService safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPoweredServicesHwComponentHwResourceService.canInstantiate(obj))
        	return new ProfileAssociationPoweredServicesHwComponentHwResourceService(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPoweredServicesHwComponentHwResourceService: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cc57d50e-9e65-4522-b7d9-1577744147b1")
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
        ProfileAssociationPoweredServicesHwComponentHwResourceService other = (ProfileAssociationPoweredServicesHwComponentHwResourceService) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("d0bbe2a9-5579-4b56-bf15-aa72ec2f9252")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("50319d01-75e3-4019-95d1-dbc7e3ff3135")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2c2d14fc-0014-4e74-bf83-c6eb1698a6bd")
    protected ProfileAssociationPoweredServicesHwComponentHwResourceService(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("22baf47b-f574-4398-b8f4-6504d96fa765")
    public static final class MdaTypes {
        @objid ("ee2ddda2-3c09-4f31-9889-6965cb476797")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("afa8a093-7457-44e4-83f7-3feacc286259")
        private static Stereotype MDAASSOCDEP;

        @objid ("dff9e9f7-45fc-48b9-b571-13278c23ca79")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("63e9c556-299d-4b40-9f6f-fda030ba7065")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cae413cd-937d-11e0-b960-0027103f347c");
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
