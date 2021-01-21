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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_subComponents_HwComponent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e5530da3-949e-4859-bda3-d746b36579bd")
public class ProfileAssociationSubComponentsHwComponent {
    @objid ("8a6b7076-f705-4a9c-ac95-b3f8b58fda0c")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_subComponents_HwComponent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("dd66d524-1498-4942-8de8-e4632bfe3573")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSubComponentsHwComponent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_subComponents_HwComponent >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4bfeb4db-609c-4db6-a3b1-4b174035d66f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSubComponentsHwComponent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_subComponents_HwComponent >> then instantiate a {@link ProfileAssociationSubComponentsHwComponent} proxy.
     * 
     * @return a {@link ProfileAssociationSubComponentsHwComponent} proxy on the created {@link Dependency}.
     */
    @objid ("a2fba374-60da-4a63-8f71-36811477c459")
    public static ProfileAssociationSubComponentsHwComponent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSubComponentsHwComponent.STEREOTYPE_NAME);
        return ProfileAssociationSubComponentsHwComponent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSubComponentsHwComponent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_subComponents_HwComponent >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSubComponentsHwComponent} proxy or <i>null</i>.
     */
    @objid ("c9503995-4ee0-48e7-b635-f2a4e8132497")
    public static ProfileAssociationSubComponentsHwComponent instantiate(final Dependency obj) {
        return ProfileAssociationSubComponentsHwComponent.canInstantiate(obj) ? new ProfileAssociationSubComponentsHwComponent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSubComponentsHwComponent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_subComponents_HwComponent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSubComponentsHwComponent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0269c807-580c-4f67-89f7-ec18dea2acc5")
    public static ProfileAssociationSubComponentsHwComponent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSubComponentsHwComponent.canInstantiate(obj))
        	return new ProfileAssociationSubComponentsHwComponent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSubComponentsHwComponent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed3ae7c0-d1ff-423f-9b27-0c92d0824783")
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
        ProfileAssociationSubComponentsHwComponent other = (ProfileAssociationSubComponentsHwComponent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("1237acd1-5dcf-471d-9cf1-00f623e1acbe")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a3edeb91-0528-4ae6-82ac-39bd7f362dee")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1492047c-8aec-4ea2-9c57-bbb3225d7dcf")
    protected ProfileAssociationSubComponentsHwComponent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c88612a6-373c-4d52-ba8a-36fe6fca3d42")
    public static final class MdaTypes {
        @objid ("459af4ef-b1f7-4387-bb7f-9f02fe5c26f3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("baa24c11-e02f-4b34-956f-99e4dcd2ede1")
        private static Stereotype MDAASSOCDEP;

        @objid ("dec456b9-b25c-438b-9c6f-31d1bfd63340")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8aaef579-9e8b-4d44-9c48-470892b29bea")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dceffb1d-937d-11e0-b960-0027103f347c");
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
