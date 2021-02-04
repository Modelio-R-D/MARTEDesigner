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
import org.modelio.module.marte.api.extensions.infrastructure.dependency.ProfileAssociationModeNfpConstraintMode;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_mode_NfpConstraint_Mode >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("884e4072-ce7e-4f87-b8a5-ae864becc55c")
public class ProfileAssociationModeNfpConstraintMode {
    @objid ("950be3ac-73dc-4ff9-8aa2-a071d7781257")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_mode_NfpConstraint_Mode";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d8675b4a-bb63-464d-9694-12b848c1c304")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationModeNfpConstraintMode proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_mode_NfpConstraint_Mode >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("35d0c4b1-ba4c-4215-8e4f-891e65808031")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationModeNfpConstraintMode.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_mode_NfpConstraint_Mode >> then instantiate a {@link ProfileAssociationModeNfpConstraintMode} proxy.
     * 
     * @return a {@link ProfileAssociationModeNfpConstraintMode} proxy on the created {@link Dependency}.
     */
    @objid ("adec6031-0567-4e85-99aa-5deb01f26a02")
    public static ProfileAssociationModeNfpConstraintMode create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationModeNfpConstraintMode.STEREOTYPE_NAME);
        return ProfileAssociationModeNfpConstraintMode.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationModeNfpConstraintMode} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mode_NfpConstraint_Mode >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationModeNfpConstraintMode} proxy or <i>null</i>.
     */
    @objid ("4dd59842-d491-4367-a409-b10df4e3f912")
    public static ProfileAssociationModeNfpConstraintMode instantiate(final Dependency obj) {
        return ProfileAssociationModeNfpConstraintMode.canInstantiate(obj) ? new ProfileAssociationModeNfpConstraintMode(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationModeNfpConstraintMode} proxy from a {@link Dependency} stereotyped << ProfileAssociation_mode_NfpConstraint_Mode >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationModeNfpConstraintMode} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4f4e357b-54a6-494c-95f7-d62def2f2501")
    public static ProfileAssociationModeNfpConstraintMode safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationModeNfpConstraintMode.canInstantiate(obj))
        	return new ProfileAssociationModeNfpConstraintMode(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationModeNfpConstraintMode: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("59548823-63d6-4381-96bf-6805881eb69c")
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
        ProfileAssociationModeNfpConstraintMode other = (ProfileAssociationModeNfpConstraintMode) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b828d945-cca8-40a5-9ecd-b15c417f1add")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("d7ace8b5-55ab-4011-b65d-e17972d7ec68")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f7f05b1e-ed75-4901-8480-cdbe2df9a0c1")
    protected ProfileAssociationModeNfpConstraintMode(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a5eb791f-d519-4cd9-86c0-51e05918b3ed")
    public static final class MdaTypes {
        @objid ("28504073-bce0-4879-92a6-c3a4ae1b30f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43e17014-2e5d-4f2f-9066-4c82f192ac55")
        private static Stereotype MDAASSOCDEP;

        @objid ("d4b14d7b-1c9c-4832-9951-e37ca16f76b4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("860ed55d-bcaf-463c-aa67-c7cfe2976ede")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad6dd368-7ddd-11df-9e39-0014222a9f79");
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
