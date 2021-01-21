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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_blocksRAM_HwPLD_HwRAM >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d669ea1b-fe54-4c8a-8a1c-93a1e291260e")
public class ProfileAssociationBlocksRAMHwPLDHwRAM {
    @objid ("0369feb8-32b0-43b5-9ec0-4916137c56da")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_blocksRAM_HwPLD_HwRAM";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c7a20def-58d8-447f-87d1-fdfda9a106ce")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBlocksRAMHwPLDHwRAM proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_blocksRAM_HwPLD_HwRAM >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a603680b-7a52-468b-ad4e-0d31ff7206b7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBlocksRAMHwPLDHwRAM.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_blocksRAM_HwPLD_HwRAM >> then instantiate a {@link ProfileAssociationBlocksRAMHwPLDHwRAM} proxy.
     * 
     * @return a {@link ProfileAssociationBlocksRAMHwPLDHwRAM} proxy on the created {@link Dependency}.
     */
    @objid ("3009cc15-bde7-47b6-8bc8-6be98580f5d9")
    public static ProfileAssociationBlocksRAMHwPLDHwRAM create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBlocksRAMHwPLDHwRAM.STEREOTYPE_NAME);
        return ProfileAssociationBlocksRAMHwPLDHwRAM.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBlocksRAMHwPLDHwRAM} proxy from a {@link Dependency} stereotyped << ProfileAssociation_blocksRAM_HwPLD_HwRAM >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBlocksRAMHwPLDHwRAM} proxy or <i>null</i>.
     */
    @objid ("36625ae0-d66f-4107-9382-6befb9242060")
    public static ProfileAssociationBlocksRAMHwPLDHwRAM instantiate(final Dependency obj) {
        return ProfileAssociationBlocksRAMHwPLDHwRAM.canInstantiate(obj) ? new ProfileAssociationBlocksRAMHwPLDHwRAM(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBlocksRAMHwPLDHwRAM} proxy from a {@link Dependency} stereotyped << ProfileAssociation_blocksRAM_HwPLD_HwRAM >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBlocksRAMHwPLDHwRAM} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1b5ac6c4-84db-42b5-930d-d3af428aeb0c")
    public static ProfileAssociationBlocksRAMHwPLDHwRAM safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBlocksRAMHwPLDHwRAM.canInstantiate(obj))
        	return new ProfileAssociationBlocksRAMHwPLDHwRAM(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBlocksRAMHwPLDHwRAM: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("49727ffa-9c66-4e3c-a332-199222f110cb")
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
        ProfileAssociationBlocksRAMHwPLDHwRAM other = (ProfileAssociationBlocksRAMHwPLDHwRAM) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("7cdc1ed6-95c4-4b9a-bf2d-014432766325")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0873923f-6847-4970-8435-12474e1745f8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ed0e92a4-eb34-4fa4-b264-8d4c06e52cfc")
    protected ProfileAssociationBlocksRAMHwPLDHwRAM(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("00a94a70-ff01-43a9-9b67-f8e0d671a6e3")
    public static final class MdaTypes {
        @objid ("3724f577-a200-4637-824c-dd2ad57c957a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9c42d5a7-3bd1-448a-9a9e-6b653539ff08")
        private static Stereotype MDAASSOCDEP;

        @objid ("59e54f2b-d7cd-43d2-b194-a598a0099c47")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("faebf54a-1e9c-4fa0-b785-86ab5c6e7af1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "59d4187d-937d-11e0-b960-0027103f347c");
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
