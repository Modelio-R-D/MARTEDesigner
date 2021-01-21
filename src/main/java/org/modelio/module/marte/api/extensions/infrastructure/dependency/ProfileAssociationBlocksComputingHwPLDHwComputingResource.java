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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e4ff7875-909f-4388-97b0-c19886dc6256")
public class ProfileAssociationBlocksComputingHwPLDHwComputingResource {
    @objid ("b973706b-24a0-4aad-802f-eebca19365c4")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_blocksComputing_HwPLD_HwComputingResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("cbb412ee-9b0e-4a4d-8f88-167e8e58b267")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e8846371-acec-4d77-a40b-6b714f8b8cc1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBlocksComputingHwPLDHwComputingResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >> then instantiate a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy.
     * 
     * @return a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy on the created {@link Dependency}.
     */
    @objid ("d1bdf9db-55a7-43c2-a58c-f9a4d32157e8")
    public static ProfileAssociationBlocksComputingHwPLDHwComputingResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBlocksComputingHwPLDHwComputingResource.STEREOTYPE_NAME);
        return ProfileAssociationBlocksComputingHwPLDHwComputingResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy or <i>null</i>.
     */
    @objid ("f2e3653a-f99f-485e-b57b-28ddf205ca68")
    public static ProfileAssociationBlocksComputingHwPLDHwComputingResource instantiate(final Dependency obj) {
        return ProfileAssociationBlocksComputingHwPLDHwComputingResource.canInstantiate(obj) ? new ProfileAssociationBlocksComputingHwPLDHwComputingResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_blocksComputing_HwPLD_HwComputingResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBlocksComputingHwPLDHwComputingResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("da8cd428-3df3-42e8-af8f-179ddbc96fa2")
    public static ProfileAssociationBlocksComputingHwPLDHwComputingResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBlocksComputingHwPLDHwComputingResource.canInstantiate(obj))
        	return new ProfileAssociationBlocksComputingHwPLDHwComputingResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBlocksComputingHwPLDHwComputingResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5dd53865-8fb8-47aa-9223-c6f067c236a7")
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
        ProfileAssociationBlocksComputingHwPLDHwComputingResource other = (ProfileAssociationBlocksComputingHwPLDHwComputingResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b481023a-4eb1-4bd5-836f-86a303259b72")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("8f840731-4da2-46e2-bc2c-14d049d5b3f9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e8ba14f7-8864-4d05-9498-82878b2f8e5b")
    protected ProfileAssociationBlocksComputingHwPLDHwComputingResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d64f2f81-43df-4c2d-b6e0-0a25cda54a8d")
    public static final class MdaTypes {
        @objid ("0ca3139a-952f-427a-9760-2f5fa6965272")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0dcc118-c4f0-4c34-912b-32aa0765126b")
        private static Stereotype MDAASSOCDEP;

        @objid ("450d96ea-a0f2-48c5-8d64-fefdbacd5a17")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9844d63f-3d0e-4a6c-8236-6ffbcda2f776")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "10437743-937d-11e0-b960-0027103f347c");
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
