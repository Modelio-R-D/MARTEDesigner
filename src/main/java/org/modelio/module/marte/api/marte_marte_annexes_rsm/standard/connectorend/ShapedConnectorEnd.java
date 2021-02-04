/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connectorend;

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
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ConnectorEnd} with << Shaped_ConnectorEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("338b838a-87d9-4833-80b3-88a1a27f079d")
public class ShapedConnectorEnd {
    @objid ("b70d40ff-96ed-408f-829e-6fc6c3c3ff1b")
    public static final String STEREOTYPE_NAME = "Shaped_ConnectorEnd";

    @objid ("5550a76c-e8d3-482c-aaaa-2f2477a55003")
    public static final String SHAPED_CONNECTOREND_SHAPE_TAGTYPE = "Shaped_ConnectorEnd_shape";

    /**
     * The underlying {@link ConnectorEnd} represented by this proxy, never null.
     */
    @objid ("80cab034-05ea-47c6-a1df-a7465c5298bf")
    protected final ConnectorEnd elt;

    /**
     * Tells whether a {@link ShapedConnectorEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link ConnectorEnd} stereotyped << Shaped_ConnectorEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4adf0572-1d4d-468f-8db5-d1e416d2c187")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ConnectorEnd) && ((ConnectorEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedConnectorEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ConnectorEnd} stereotyped << Shaped_ConnectorEnd >> then instantiate a {@link ShapedConnectorEnd} proxy.
     * 
     * @return a {@link ShapedConnectorEnd} proxy on the created {@link ConnectorEnd}.
     */
    @objid ("a2dc3f03-9dfb-4de5-92d0-ed1ffebe47da")
    public static ShapedConnectorEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ConnectorEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedConnectorEnd.STEREOTYPE_NAME);
        return ShapedConnectorEnd.instantiate((ConnectorEnd)e);
    }

    /**
     * Tries to instantiate a {@link ShapedConnectorEnd} proxy from a {@link ConnectorEnd} stereotyped << Shaped_ConnectorEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ConnectorEnd
     * @return a {@link ShapedConnectorEnd} proxy or <i>null</i>.
     */
    @objid ("649eb4ff-cb80-4a70-a1ac-eb0d582c3c4d")
    public static ShapedConnectorEnd instantiate(final ConnectorEnd obj) {
        return ShapedConnectorEnd.canInstantiate(obj) ? new ShapedConnectorEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ShapedConnectorEnd} proxy from a {@link ConnectorEnd} stereotyped << Shaped_ConnectorEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ConnectorEnd}
     * @return a {@link ShapedConnectorEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("05a285cf-638c-4baf-8023-e95deef3afa8")
    public static ShapedConnectorEnd safeInstantiate(final ConnectorEnd obj) throws IllegalArgumentException {
        if (ShapedConnectorEnd.canInstantiate(obj))
        	return new ShapedConnectorEnd(obj);
        else
        	throw new IllegalArgumentException("ShapedConnectorEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bd087941-e60b-47a8-890f-ba7e823c2613")
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
        ShapedConnectorEnd other = (ShapedConnectorEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ConnectorEnd}. 
     * @return the ConnectorEnd represented by this proxy, never null.
     */
    @objid ("b5e9bdc9-fe3b-4f93-86f5-1109d86f4002")
    public ConnectorEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_ConnectorEnd_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5cc9b9c2-51f6-40f3-b17a-4bf5fb623590")
    public String getShaped_ConnectorEnd_shape() {
        return this.elt.getTagValue(ShapedConnectorEnd.MdaTypes.SHAPED_CONNECTOREND_SHAPE_TAGTYPE_ELT);
    }

    @objid ("43a5aa8a-ed16-4403-a8d3-bfc2921f1c29")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_ConnectorEnd_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81b6309d-73b5-46f7-a98c-c2da7f029b92")
    public void setShaped_ConnectorEnd_shape(final String value) {
        this.elt.putTagValue(ShapedConnectorEnd.MdaTypes.SHAPED_CONNECTOREND_SHAPE_TAGTYPE_ELT, value);
    }

    @objid ("2e73d16e-8479-46d5-be1a-3b9e23c3ccdb")
    protected ShapedConnectorEnd(final ConnectorEnd elt) {
        this.elt = elt;
    }

    @objid ("423c6cef-d75e-4070-973e-0ef047dd577b")
    public static final class MdaTypes {
        @objid ("fafb15f4-0bbc-45a5-b24b-34213b2699f6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9f1433c2-2562-44c4-b31e-ec1c75ddd747")
        public static TagType SHAPED_CONNECTOREND_SHAPE_TAGTYPE_ELT;

        @objid ("0c007fa3-4959-4d53-bf2b-07f49fcc6146")
        private static Stereotype MDAASSOCDEP;

        @objid ("6d846570-0bfd-453a-9471-2270941555ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ffa1f38c-daa1-447b-9fb3-e66fe5801eda")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03da8ea2-0ccf-11df-8525-001302895b2b");
            SHAPED_CONNECTOREND_SHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03da8ea3-0ccf-11df-8525-001302895b2b");
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
