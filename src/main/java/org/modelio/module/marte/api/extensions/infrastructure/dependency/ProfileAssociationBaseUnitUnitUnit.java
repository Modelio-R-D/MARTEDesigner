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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_baseUnit_Unit_Unit >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ac2f8392-3791-4408-974b-289c821a5878")
public class ProfileAssociationBaseUnitUnitUnit {
    @objid ("973193ed-ca9f-4d15-9956-020275114201")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_baseUnit_Unit_Unit";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e2455803-3ae4-48f6-b501-ee523b1020e4")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBaseUnitUnitUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_baseUnit_Unit_Unit >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("3d635e21-cd6f-42c3-ba35-aaacede9d13d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBaseUnitUnitUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_baseUnit_Unit_Unit >> then instantiate a {@link ProfileAssociationBaseUnitUnitUnit} proxy.
     * 
     * @return a {@link ProfileAssociationBaseUnitUnitUnit} proxy on the created {@link Dependency}.
     */
    @objid ("9e3e7609-0fab-4e54-ad89-6a556d34bae9")
    public static ProfileAssociationBaseUnitUnitUnit create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBaseUnitUnitUnit.STEREOTYPE_NAME);
        return ProfileAssociationBaseUnitUnitUnit.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBaseUnitUnitUnit} proxy from a {@link Dependency} stereotyped << ProfileAssociation_baseUnit_Unit_Unit >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBaseUnitUnitUnit} proxy or <i>null</i>.
     */
    @objid ("88b5959e-9490-4b69-987a-6dc86b9d413b")
    public static ProfileAssociationBaseUnitUnitUnit instantiate(final Dependency obj) {
        return ProfileAssociationBaseUnitUnitUnit.canInstantiate(obj) ? new ProfileAssociationBaseUnitUnitUnit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBaseUnitUnitUnit} proxy from a {@link Dependency} stereotyped << ProfileAssociation_baseUnit_Unit_Unit >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBaseUnitUnitUnit} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("526bb565-e200-44ee-8408-b7e0bf9a574b")
    public static ProfileAssociationBaseUnitUnitUnit safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBaseUnitUnitUnit.canInstantiate(obj))
        	return new ProfileAssociationBaseUnitUnitUnit(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBaseUnitUnitUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3e07b72c-03a5-41ba-84a9-23c1454d96bf")
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
        ProfileAssociationBaseUnitUnitUnit other = (ProfileAssociationBaseUnitUnitUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("47885a6a-95cd-4766-9270-cb3c700f264f")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("8b6d6676-297d-43c8-8dac-13d52f37582b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9d570272-75d5-4806-9bf6-e5d21e205b9c")
    protected ProfileAssociationBaseUnitUnitUnit(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("ddf88b69-5b35-4243-bb00-c9e9052c05ed")
    public static final class MdaTypes {
        @objid ("1a646869-adfa-403e-b6c6-22effbd3b775")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8e254a1b-1c32-4e26-af06-4bdccb445899")
        private static Stereotype MDAASSOCDEP;

        @objid ("5c7f0e03-304f-427e-92e7-99f010e25e70")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cf7cb7ca-60f0-4ed0-ac8c-018f08c60426")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c39ade18-7e03-11df-9e39-0014222a9f79");
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
