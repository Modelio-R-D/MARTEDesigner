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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_memorySpaces_MemoryPartition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9c15d64f-58c5-4127-ae97-0920ee35432b")
public class ProfileAssociationMemorySpacesMemoryPartition {
    @objid ("5005b174-356e-459d-b2a7-4c920b1e4e9f")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_memorySpaces_MemoryPartition";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("653ea5bf-5461-4fe7-a7bc-0be7d4b5d0e8")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMemorySpacesMemoryPartition proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_memorySpaces_MemoryPartition >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0d28e72b-03fc-4c87-bd24-fcc1380d6bdc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemorySpacesMemoryPartition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_memorySpaces_MemoryPartition >> then instantiate a {@link ProfileAssociationMemorySpacesMemoryPartition} proxy.
     * 
     * @return a {@link ProfileAssociationMemorySpacesMemoryPartition} proxy on the created {@link Dependency}.
     */
    @objid ("18f10665-628c-4dd6-a570-6d1e5f92704c")
    public static ProfileAssociationMemorySpacesMemoryPartition create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemorySpacesMemoryPartition.STEREOTYPE_NAME);
        return ProfileAssociationMemorySpacesMemoryPartition.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemorySpacesMemoryPartition} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memorySpaces_MemoryPartition >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMemorySpacesMemoryPartition} proxy or <i>null</i>.
     */
    @objid ("0ef72f9b-86af-4ae0-af9d-4a738bfd50e2")
    public static ProfileAssociationMemorySpacesMemoryPartition instantiate(final Dependency obj) {
        return ProfileAssociationMemorySpacesMemoryPartition.canInstantiate(obj) ? new ProfileAssociationMemorySpacesMemoryPartition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemorySpacesMemoryPartition} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memorySpaces_MemoryPartition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMemorySpacesMemoryPartition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f2923e01-030c-4f40-ba1a-f48215ebc2d2")
    public static ProfileAssociationMemorySpacesMemoryPartition safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMemorySpacesMemoryPartition.canInstantiate(obj))
        	return new ProfileAssociationMemorySpacesMemoryPartition(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMemorySpacesMemoryPartition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("12b30db6-78c1-4f2a-88ec-57f70b5153b8")
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
        ProfileAssociationMemorySpacesMemoryPartition other = (ProfileAssociationMemorySpacesMemoryPartition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("ae074a2f-3245-44e5-abc7-6df82e0bcb15")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("f8946cf8-3998-4165-ade1-2fdd4964a7d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8830ba35-76bc-4fd8-bf1d-a19699dcae09")
    protected ProfileAssociationMemorySpacesMemoryPartition(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("23e94612-4d31-4005-bc3f-73eab623e6ff")
    public static final class MdaTypes {
        @objid ("4c6e7e39-9899-4069-af49-94be709d2389")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("10f3d0ab-2e79-4ee6-a6a2-b48044bc470e")
        private static Stereotype MDAASSOCDEP;

        @objid ("27920c94-b32e-40a0-844d-63eed8c75152")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("414f6b49-d793-4b34-826b-fcce1a737703")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5f87763b-9757-11e0-94fb-0027103f347c");
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
