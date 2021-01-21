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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_resources_GaResourcesPlatform >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("df1422d3-3cb4-47c4-8950-7a9acbe4b48b")
public class ProfileAssociationResourcesGaResourcesPlatform {
    @objid ("8777ce1c-2ac4-4db5-b089-fbff76966c67")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_resources_GaResourcesPlatform";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("5f857c7d-e30c-4806-a132-10814edee786")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationResourcesGaResourcesPlatform proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_resources_GaResourcesPlatform >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8b49106c-cc2e-4fb4-b62d-e2b167a48357")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResourcesGaResourcesPlatform.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_resources_GaResourcesPlatform >> then instantiate a {@link ProfileAssociationResourcesGaResourcesPlatform} proxy.
     * 
     * @return a {@link ProfileAssociationResourcesGaResourcesPlatform} proxy on the created {@link Dependency}.
     */
    @objid ("f5b523e5-a956-4879-b6e6-d132a1f1ee4a")
    public static ProfileAssociationResourcesGaResourcesPlatform create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResourcesGaResourcesPlatform.STEREOTYPE_NAME);
        return ProfileAssociationResourcesGaResourcesPlatform.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResourcesGaResourcesPlatform} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resources_GaResourcesPlatform >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationResourcesGaResourcesPlatform} proxy or <i>null</i>.
     */
    @objid ("c925bcfc-4926-4b5f-bf1c-16fa32a292d5")
    public static ProfileAssociationResourcesGaResourcesPlatform instantiate(final Dependency obj) {
        return ProfileAssociationResourcesGaResourcesPlatform.canInstantiate(obj) ? new ProfileAssociationResourcesGaResourcesPlatform(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResourcesGaResourcesPlatform} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resources_GaResourcesPlatform >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationResourcesGaResourcesPlatform} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4823f74a-55d1-4b56-95e2-0f51eaa9754d")
    public static ProfileAssociationResourcesGaResourcesPlatform safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationResourcesGaResourcesPlatform.canInstantiate(obj))
        	return new ProfileAssociationResourcesGaResourcesPlatform(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationResourcesGaResourcesPlatform: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4565ec01-0997-47a9-bcd0-b768e0d6b65a")
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
        ProfileAssociationResourcesGaResourcesPlatform other = (ProfileAssociationResourcesGaResourcesPlatform) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("58dbf590-a625-4e6e-a095-d010bca16ccd")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("1d2383bf-7fcc-4a41-a07e-094b84dae7fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7add447d-13d9-4d5b-89f1-f56e9d62cc88")
    protected ProfileAssociationResourcesGaResourcesPlatform(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5e68fb87-08f6-4624-bec5-ef4d6fb2b608")
    public static final class MdaTypes {
        @objid ("10c92a93-7257-4ad3-bdf8-3bb16e52115d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf69e546-ea81-4617-a5fb-9aefba15677a")
        private static Stereotype MDAASSOCDEP;

        @objid ("ede70313-73e0-498f-ada9-228eadd98d65")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77af041b-d6d7-4cdd-8653-53c5103657dc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cf79807a-dd1f-11e0-a2be-0027103f347c");
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
