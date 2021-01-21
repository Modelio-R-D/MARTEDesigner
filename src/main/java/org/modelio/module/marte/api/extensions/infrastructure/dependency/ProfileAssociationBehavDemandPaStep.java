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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_behavDemand_PaStep >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("bcdc433a-e2ae-4d3c-9285-fd782dddf38d")
public class ProfileAssociationBehavDemandPaStep {
    @objid ("45a19a23-3910-41f9-a68f-f86d79715025")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_behavDemand_PaStep";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("9de1d717-f672-41c7-90bf-c05647d59c16")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBehavDemandPaStep proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_behavDemand_PaStep >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("98a412b0-e567-4961-a516-f4a5ceaf63ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBehavDemandPaStep.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_behavDemand_PaStep >> then instantiate a {@link ProfileAssociationBehavDemandPaStep} proxy.
     * 
     * @return a {@link ProfileAssociationBehavDemandPaStep} proxy on the created {@link Dependency}.
     */
    @objid ("1a05730f-5cba-4a62-9886-60e4e659c7a8")
    public static ProfileAssociationBehavDemandPaStep create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBehavDemandPaStep.STEREOTYPE_NAME);
        return ProfileAssociationBehavDemandPaStep.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBehavDemandPaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_behavDemand_PaStep >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBehavDemandPaStep} proxy or <i>null</i>.
     */
    @objid ("e2ac07a4-6bc8-4871-81ea-0dfc55ab54f4")
    public static ProfileAssociationBehavDemandPaStep instantiate(final Dependency obj) {
        return ProfileAssociationBehavDemandPaStep.canInstantiate(obj) ? new ProfileAssociationBehavDemandPaStep(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBehavDemandPaStep} proxy from a {@link Dependency} stereotyped << ProfileAssociation_behavDemand_PaStep >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBehavDemandPaStep} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("551f579c-3bb7-42c8-b224-01c4b5949ca2")
    public static ProfileAssociationBehavDemandPaStep safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBehavDemandPaStep.canInstantiate(obj))
        	return new ProfileAssociationBehavDemandPaStep(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBehavDemandPaStep: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a8674fd6-8447-4cc9-a6ae-a9329ad8b302")
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
        ProfileAssociationBehavDemandPaStep other = (ProfileAssociationBehavDemandPaStep) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("66850004-9fbf-46ed-91cf-60ae0a4f4e84")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("dd0b3191-741f-4046-afb6-5ddc22310878")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e0422b61-9911-4bcf-9d41-128b2054f323")
    protected ProfileAssociationBehavDemandPaStep(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e2b2c75e-446a-4202-92ab-04859cbf5d19")
    public static final class MdaTypes {
        @objid ("1932d0e9-dd20-4f28-a492-eab70b3679b5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cc667622-276b-4d28-a6d4-40bfa28c43a2")
        private static Stereotype MDAASSOCDEP;

        @objid ("8fb05e4d-ae7d-4ac6-9b2b-fbe06fe70e3e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("45a260ed-e67c-469a-a046-5e4bf7b1011c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0cee374d-dd21-11e0-a2be-0027103f347c");
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
