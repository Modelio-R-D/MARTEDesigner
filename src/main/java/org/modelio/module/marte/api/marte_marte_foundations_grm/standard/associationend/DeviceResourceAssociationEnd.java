/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << DeviceResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("102b4d64-6955-444e-9864-0d4c59beabdd")
public class DeviceResourceAssociationEnd extends ProcessingResourceAssociationEnd {
    @objid ("e083967d-b35a-4815-b084-fc499a06b07a")
    public static final String STEREOTYPE_NAME = "DeviceResource_AssociationEnd";

    /**
     * Tells whether a {@link DeviceResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << DeviceResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0838a530-8dc3-4803-9a7a-390cd127761d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << DeviceResource_AssociationEnd >> then instantiate a {@link DeviceResourceAssociationEnd} proxy.
     * 
     * @return a {@link DeviceResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("1fb8a9af-9b6e-460c-822f-c3723d97bd95")
    public static DeviceResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceAssociationEnd.STEREOTYPE_NAME);
        return DeviceResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DeviceResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link DeviceResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("9fe951c3-124e-4680-9cda-125b3596bb69")
    public static DeviceResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return DeviceResourceAssociationEnd.canInstantiate(obj) ? new DeviceResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DeviceResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link DeviceResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8e0f8c56-a57a-4a6e-b357-69709cf980f3")
    public static DeviceResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (DeviceResourceAssociationEnd.canInstantiate(obj))
        	return new DeviceResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a32ed6f-5f66-4e36-ba56-8c4c2fca0323")
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
        DeviceResourceAssociationEnd other = (DeviceResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("af8ab763-db2a-4597-95d3-df4f75e5e66d")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("d2b70547-1210-44eb-9aa9-39352a5f1a08")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a47e1318-2c88-47f0-8885-3dee4e47ac76")
    protected DeviceResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("21a7f360-df1e-4224-ba39-3c4c6d44e8d2")
    public static final class MdaTypes {
        @objid ("93bad2a6-8675-4c67-87a6-b406e6082f16")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8e844ac-d262-4450-a189-ae1b882b1c70")
        private static Stereotype MDAASSOCDEP;

        @objid ("c00954e4-9b99-4412-9854-b2f923a87520")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("874bbff2-b696-4ea3-9e31-5fe8a79933c4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d6-0ccf-11df-8525-001302895b2b");
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
