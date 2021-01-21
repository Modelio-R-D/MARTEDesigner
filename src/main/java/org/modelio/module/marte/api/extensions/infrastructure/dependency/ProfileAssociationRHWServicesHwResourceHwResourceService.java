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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_r_HW_Services_HwResource_HwResourceService >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a9294c95-eb39-48c2-b718-6176b625d5ba")
public class ProfileAssociationRHWServicesHwResourceHwResourceService {
    @objid ("d4c4af4a-b87e-46b5-9b84-7c27d8ae28a8")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_r_HW_Services_HwResource_HwResourceService";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("798046b2-dd0f-43e8-89a0-d781bd534592")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationRHWServicesHwResourceHwResourceService proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_r_HW_Services_HwResource_HwResourceService >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2be62aac-516c-4486-be77-e0c5532595f8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRHWServicesHwResourceHwResourceService.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_r_HW_Services_HwResource_HwResourceService >> then instantiate a {@link ProfileAssociationRHWServicesHwResourceHwResourceService} proxy.
     * 
     * @return a {@link ProfileAssociationRHWServicesHwResourceHwResourceService} proxy on the created {@link Dependency}.
     */
    @objid ("6d24f847-e621-447f-8dde-4a2a7f1750e9")
    public static ProfileAssociationRHWServicesHwResourceHwResourceService create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRHWServicesHwResourceHwResourceService.STEREOTYPE_NAME);
        return ProfileAssociationRHWServicesHwResourceHwResourceService.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRHWServicesHwResourceHwResourceService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_r_HW_Services_HwResource_HwResourceService >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationRHWServicesHwResourceHwResourceService} proxy or <i>null</i>.
     */
    @objid ("1625ca9e-8e2c-4c59-a243-c481eb2bd0ea")
    public static ProfileAssociationRHWServicesHwResourceHwResourceService instantiate(final Dependency obj) {
        return ProfileAssociationRHWServicesHwResourceHwResourceService.canInstantiate(obj) ? new ProfileAssociationRHWServicesHwResourceHwResourceService(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRHWServicesHwResourceHwResourceService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_r_HW_Services_HwResource_HwResourceService >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationRHWServicesHwResourceHwResourceService} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("aafe9312-455d-49d2-aa37-2bf6ba962b4c")
    public static ProfileAssociationRHWServicesHwResourceHwResourceService safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationRHWServicesHwResourceHwResourceService.canInstantiate(obj))
        	return new ProfileAssociationRHWServicesHwResourceHwResourceService(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationRHWServicesHwResourceHwResourceService: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9041282e-a3fc-449b-961a-5c48ce2bd949")
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
        ProfileAssociationRHWServicesHwResourceHwResourceService other = (ProfileAssociationRHWServicesHwResourceHwResourceService) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("7964318f-585e-46fa-af2e-4d5a781d8bcb")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b42fc290-371d-44f1-92f4-75c5cf71dac6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1f258b86-06ab-4090-97d6-bd112fe156e1")
    protected ProfileAssociationRHWServicesHwResourceHwResourceService(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("150f5c33-4108-4f0c-a80a-8de87d70825e")
    public static final class MdaTypes {
        @objid ("9e421dae-2673-4ebd-b6fa-4b9363b33fc0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d9f6ca0-ac92-4675-8d81-bcc47605879f")
        private static Stereotype MDAASSOCDEP;

        @objid ("c6691190-8682-4c65-8881-4ede6c3b42c8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c1226f9-e754-4bae-a9cf-f510a13a9d8b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cfcb0ce5-9384-11e0-b960-0027103f347c");
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
