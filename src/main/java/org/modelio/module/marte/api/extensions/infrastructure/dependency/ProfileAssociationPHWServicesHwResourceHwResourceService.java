/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ProfileAssociationPHWServicesHwResourceHwResourceService {
    public static final String STEREOTYPE_NAME = "ProfileAssociation_p_HW_Services_HwResource_HwResourceService";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPHWServicesHwResourceHwResourceService proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPHWServicesHwResourceHwResourceService.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >> then instantiate a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy.
     * 
     * @return a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy on the created {@link Dependency}.
     */
    public static ProfileAssociationPHWServicesHwResourceHwResourceService create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPHWServicesHwResourceHwResourceService.STEREOTYPE_NAME);
        return ProfileAssociationPHWServicesHwResourceHwResourceService.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy or <i>null</i>.
     */
    public static ProfileAssociationPHWServicesHwResourceHwResourceService instantiate(final Dependency obj) {
        return ProfileAssociationPHWServicesHwResourceHwResourceService.canInstantiate(obj) ? new ProfileAssociationPHWServicesHwResourceHwResourceService(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ProfileAssociationPHWServicesHwResourceHwResourceService safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPHWServicesHwResourceHwResourceService.canInstantiate(obj))
        	return new ProfileAssociationPHWServicesHwResourceHwResourceService(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPHWServicesHwResourceHwResourceService: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        ProfileAssociationPHWServicesHwResourceHwResourceService other = (ProfileAssociationPHWServicesHwResourceHwResourceService) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    public Dependency getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected ProfileAssociationPHWServicesHwResourceHwResourceService(final Dependency elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e1155574-937c-11e0-b960-0027103f347c");
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
