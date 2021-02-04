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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_stackSizeElements_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("36b69b17-94e0-4bd4-89e4-cd5da6b815f0")
public class ProfileAssociationStackSizeElementsSwConcurrentResource {
    @objid ("915f6342-dea3-4cc0-97d0-c26220a4eafb")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_stackSizeElements_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("8d59ace4-3f11-4943-992f-5879cdc1f57f")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationStackSizeElementsSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_stackSizeElements_SwConcurrentResource >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("22f0d72b-0ef5-4946-8ae8-69eb9d7d5880")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStackSizeElementsSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_stackSizeElements_SwConcurrentResource >> then instantiate a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("4cbfc92c-aab3-4328-8977-9c7cae8ffc5b")
    public static ProfileAssociationStackSizeElementsSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationStackSizeElementsSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationStackSizeElementsSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_stackSizeElements_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("4907e98a-f40a-4c86-b6af-0e5c3e99536e")
    public static ProfileAssociationStackSizeElementsSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationStackSizeElementsSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationStackSizeElementsSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_stackSizeElements_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationStackSizeElementsSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7a5ef31f-cd57-4f0c-858c-1e8aff26ceb4")
    public static ProfileAssociationStackSizeElementsSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationStackSizeElementsSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationStackSizeElementsSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationStackSizeElementsSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("227edbe1-586f-4fc6-8e5f-a141ea0ed373")
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
        ProfileAssociationStackSizeElementsSwConcurrentResource other = (ProfileAssociationStackSizeElementsSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("4b31dd3f-ec51-4c66-a095-bec04565341c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("4827c31a-a09b-4b74-bdb6-e64d2d01972c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6b6e6e2b-9364-4553-90e5-2fc47b4ecdd0")
    protected ProfileAssociationStackSizeElementsSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("0a662416-177b-4383-8649-56be13027356")
    public static final class MdaTypes {
        @objid ("58387d29-dab3-464e-be86-face1d654980")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("feb0cc21-ecf6-4ed4-9c5c-ff967d0bc1dc")
        private static Stereotype MDAASSOCDEP;

        @objid ("b66b007c-3002-4d95-8153-8412aed85315")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d43b6427-2920-4bce-8717-2f660c772459")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "655dca73-9756-11e0-94fb-0027103f347c");
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
