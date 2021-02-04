/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwBridge_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("61d467bd-bd76-49a6-b217-c5edc4eed246")
public class HwBridgeAssociationEnd extends HwMediaAssociationEnd {
    @objid ("c4f6251c-d77e-41a3-84b1-1e5d79fb4682")
    public static final String STEREOTYPE_NAME = "HwBridge_AssociationEnd";

    @objid ("bcb564ed-0cf5-4335-88d4-3556004c2ee5")
    public static final String HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE = "HwBridge_AssociationEnd_sides";

    /**
     * Tells whether a {@link HwBridgeAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("68f2deeb-bb17-452e-8248-42505a0840ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >> then instantiate a {@link HwBridgeAssociationEnd} proxy.
     * 
     * @return a {@link HwBridgeAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("1e9dba4b-b2c7-4c6c-a136-6e83b0a5ad61")
    public static HwBridgeAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociationEnd.STEREOTYPE_NAME);
        return HwBridgeAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBridgeAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("2c4df9b3-f891-4d11-9525-6b434a6c0499")
    public static HwBridgeAssociationEnd instantiate(final AssociationEnd obj) {
        return HwBridgeAssociationEnd.canInstantiate(obj) ? new HwBridgeAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwBridgeAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bf6bf164-d87d-4bcb-8a32-17839aac6466")
    public static HwBridgeAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBridgeAssociationEnd.canInstantiate(obj))
        	return new HwBridgeAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBridgeAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c8c697c0-9ca9-4117-9f01-124793008b09")
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
        HwBridgeAssociationEnd other = (HwBridgeAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("73b56db1-3eb3-44d9-88d1-6cb7eecc08a2")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_AssociationEnd_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("056ac91e-505a-4ddd-9924-3292b098ff73")
    public List<String> getHwBridge_AssociationEnd_sides() {
        return this.elt.getTagValues(HwBridgeAssociationEnd.MdaTypes.HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT);
    }

    @objid ("fe188330-9fc9-43d4-852d-92b23101702c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_AssociationEnd_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9dc4268b-90d8-434d-a850-7cc994a84d4e")
    public void setHwBridge_AssociationEnd_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeAssociationEnd.MdaTypes.HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("a55fc3d3-8f72-4f23-b9f9-9c0515b1d6a0")
    protected HwBridgeAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("513b5164-5600-4481-a9e6-c1187fab91f4")
    public static final class MdaTypes {
        @objid ("fce324dd-cc41-42a8-a5c8-f90c20dd4b2f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("46cc1a6b-3ba7-4a86-b670-0a1ad98f1f89")
        public static TagType HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT;

        @objid ("1dec50fb-7b6b-450e-82d0-054b5ae0effe")
        private static Stereotype MDAASSOCDEP;

        @objid ("b5b3d61d-bd54-49fd-b07e-f616166a29bd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ec30038-50e7-4749-9ff6-d3f469c7e63d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "011da46d-0ccf-11df-8525-001302895b2b");
            HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "011da474-0ccf-11df-8525-001302895b2b");
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
