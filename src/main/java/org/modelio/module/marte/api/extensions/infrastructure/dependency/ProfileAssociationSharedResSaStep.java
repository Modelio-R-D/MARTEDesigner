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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_sharedRes_SaStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("27742497-8c1b-49f9-bfa6-fb93bda7952d")
public class ProfileAssociationSharedResSaStep {
    @objid ("9c1d3a18-f2fb-4910-bcb7-3c3c5ff9adb3")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_sharedRes_SaStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("ccf5ba8f-afea-427a-a365-32a5d8cf574d")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSharedResSaStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_sharedRes_SaStep >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ebcf4548-22d9-4cea-9d87-ec2748ed02cf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSharedResSaStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_sharedRes_SaStep >> then instantiate a {@link ProfileAssociationSharedResSaStep} proxy.
     * 
     * @return a {@link ProfileAssociationSharedResSaStep} proxy on the created {@link Dependency}.
     */
    @objid ("beeb8863-1b76-4d04-9d40-9709de7075c5")
    public static ProfileAssociationSharedResSaStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSharedResSaStep.STEREOTYPE_NAME);
        return ProfileAssociationSharedResSaStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSharedResSaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sharedRes_SaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSharedResSaStep} proxy or <i>null</i>.
     */
    @objid ("1862122d-62cb-489e-8bea-0b10f52eb623")
    public static ProfileAssociationSharedResSaStep instantiate(final Dependency obj) {
        return ProfileAssociationSharedResSaStep.canInstantiate(obj) ? new ProfileAssociationSharedResSaStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSharedResSaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_sharedRes_SaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSharedResSaStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0d4dc420-1f90-4f81-91f3-3024e2411b51")
    public static ProfileAssociationSharedResSaStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSharedResSaStep.canInstantiate(obj))
        	return new ProfileAssociationSharedResSaStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSharedResSaStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4994b20a-68c1-4f8e-8d1c-e1ee3bf15cfd")
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
        ProfileAssociationSharedResSaStep other = (ProfileAssociationSharedResSaStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f69d2fc0-2ed5-46bd-bbc8-5584b447a152")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("10e0be16-6d08-40df-9371-ac7b98650be5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7ffb208e-510c-4f1b-ba47-6af0367aa852")
    protected ProfileAssociationSharedResSaStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("dd337b70-feb6-4d66-89ab-e2873396857c")
    public static final class MdaTypes {
        @objid ("fd8dc60b-0fe5-4803-9cb9-01edcfcf1d5e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef35472b-4d57-4580-a507-2233d4a17736")
        private static Stereotype MDAASSOCDEP;

        @objid ("d2782c78-5a2a-4e51-b73a-a284855f4ee5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e6717746-605c-4537-b37c-8790b383c983")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0d509cc-dd1f-11e0-a2be-0027103f347c");
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
