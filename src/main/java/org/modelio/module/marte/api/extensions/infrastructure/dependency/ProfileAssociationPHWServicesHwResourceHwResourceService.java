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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f993facb-e97f-4908-be4f-66e77bf13c04")
public class ProfileAssociationPHWServicesHwResourceHwResourceService {
    @objid ("cfcb8d5a-37e2-4c04-ba71-5ff7ff3357b8")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_p_HW_Services_HwResource_HwResourceService";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("26e3c043-aab5-421e-a607-d4da49bba55b")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationPHWServicesHwResourceHwResourceService proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8cb5ac90-c817-401f-abd7-e2bd68fd97a5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPHWServicesHwResourceHwResourceService.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >> then instantiate a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy.
     * 
     * @return a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy on the created {@link Dependency}.
     */
    @objid ("f1ee3b0d-7e09-407a-800d-f8b5d88217a7")
    public static ProfileAssociationPHWServicesHwResourceHwResourceService create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationPHWServicesHwResourceHwResourceService.STEREOTYPE_NAME);
        return ProfileAssociationPHWServicesHwResourceHwResourceService.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy from a {@link Dependency} stereotyped << ProfileAssociation_p_HW_Services_HwResource_HwResourceService >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationPHWServicesHwResourceHwResourceService} proxy or <i>null</i>.
     */
    @objid ("3d60d9a0-9bf3-4612-8663-40110b53ca07")
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
    @objid ("2ad9c3c7-4f23-437d-9de0-9f7d1d76b673")
    public static ProfileAssociationPHWServicesHwResourceHwResourceService safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationPHWServicesHwResourceHwResourceService.canInstantiate(obj))
        	return new ProfileAssociationPHWServicesHwResourceHwResourceService(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationPHWServicesHwResourceHwResourceService: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("64115c86-bd03-4af1-83f5-f50f91fe1484")
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
    @objid ("4480a337-4082-4a04-8bf8-b89b9c4f5e41")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("9a2d7d32-6ef8-4b94-9dfb-01c94eb2e59c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dcbd3978-4990-4bd7-ae05-eabe74a0d137")
    protected ProfileAssociationPHWServicesHwResourceHwResourceService(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("70b5ae22-e925-4e5b-a930-0ba9e90038e5")
    public static final class MdaTypes {
        @objid ("52306e53-934f-4ddb-9311-3ea1cb2cb5fd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cd3e16c7-e902-45f2-a483-d3d0b30dcd87")
        private static Stereotype MDAASSOCDEP;

        @objid ("69559c43-d8a3-4c06-a182-da2be4eb03e9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd68d448-f172-453b-8350-d025ad963f7c")
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
