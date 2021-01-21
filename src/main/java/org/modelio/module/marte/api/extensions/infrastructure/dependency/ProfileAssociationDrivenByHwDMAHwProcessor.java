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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_drivenBy_HwDMA_HwProcessor >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cee1ea78-02ab-4281-98d1-e39060009654")
public class ProfileAssociationDrivenByHwDMAHwProcessor {
    @objid ("a3ac8362-ccd2-4c4c-9a03-16a318a2d97a")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_drivenBy_HwDMA_HwProcessor";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("b50de926-0d30-4abf-b8fc-145826420106")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationDrivenByHwDMAHwProcessor proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_drivenBy_HwDMA_HwProcessor >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a82d194e-852a-43e4-8fa9-2aee5261113a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDrivenByHwDMAHwProcessor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_drivenBy_HwDMA_HwProcessor >> then instantiate a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy.
     * 
     * @return a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy on the created {@link Dependency}.
     */
    @objid ("40ceeb4c-778f-4d44-a3c7-80e1a5ffb437")
    public static ProfileAssociationDrivenByHwDMAHwProcessor create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationDrivenByHwDMAHwProcessor.STEREOTYPE_NAME);
        return ProfileAssociationDrivenByHwDMAHwProcessor.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy from a {@link Dependency} stereotyped << ProfileAssociation_drivenBy_HwDMA_HwProcessor >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy or <i>null</i>.
     */
    @objid ("1850e511-9d2a-454d-a6ad-d8b7faaef884")
    public static ProfileAssociationDrivenByHwDMAHwProcessor instantiate(final Dependency obj) {
        return ProfileAssociationDrivenByHwDMAHwProcessor.canInstantiate(obj) ? new ProfileAssociationDrivenByHwDMAHwProcessor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy from a {@link Dependency} stereotyped << ProfileAssociation_drivenBy_HwDMA_HwProcessor >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationDrivenByHwDMAHwProcessor} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("793e1c02-d8d3-4be1-b8c3-7db0e2229737")
    public static ProfileAssociationDrivenByHwDMAHwProcessor safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationDrivenByHwDMAHwProcessor.canInstantiate(obj))
        	return new ProfileAssociationDrivenByHwDMAHwProcessor(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationDrivenByHwDMAHwProcessor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3236e39b-4fcd-4efa-bd09-b6f2f92573ef")
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
        ProfileAssociationDrivenByHwDMAHwProcessor other = (ProfileAssociationDrivenByHwDMAHwProcessor) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("ab86c95d-90b2-42bc-bd24-01a614cd490c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("bffaf940-5a73-4b3a-9c37-08d596d459e8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0caf675c-7371-4b17-9c4b-8417f8a9cafb")
    protected ProfileAssociationDrivenByHwDMAHwProcessor(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a681cd0a-9374-47ca-89ba-00be10f5ce7a")
    public static final class MdaTypes {
        @objid ("181a2026-ef94-44ff-a0e5-e17276929336")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b0429cd9-43e8-4313-80d2-1fba09064d25")
        private static Stereotype MDAASSOCDEP;

        @objid ("d918b251-4de2-473d-9580-981936388055")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3d3ee518-f54c-4e2d-81a6-a2100aef9774")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a0d18452-936b-11e0-b960-0027103f347c");
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
