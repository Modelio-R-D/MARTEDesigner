/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("18426d22-cded-46f5-aa81-eb62ca7a3d1b")
    public static final String STEREOTYPE_NAME = "Shaped_ConnectorEnd";

    @objid ("3890551c-1988-4f5d-a9e8-9572120495dc")
    public static final String SHAPED_CONNECTOREND_SHAPE_TAGTYPE = "Shaped_ConnectorEnd_shape";

    /**
     * The underlying {@link ConnectorEnd} represented by this proxy, never null.
     */
    @objid ("9112075e-f916-4403-803e-8640686f3ed9")
    protected final ConnectorEnd elt;

    /**
     * Tells whether a {@link ShapedConnectorEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link ConnectorEnd} stereotyped << Shaped_ConnectorEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1973690c-e932-4a16-8fd0-2f0701adb029")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ConnectorEnd) && ((ConnectorEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedConnectorEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ConnectorEnd} stereotyped << Shaped_ConnectorEnd >> then instantiate a {@link ShapedConnectorEnd} proxy.
     * 
     * @return a {@link ShapedConnectorEnd} proxy on the created {@link ConnectorEnd}.
     */
    @objid ("f8a6bdae-6242-409d-bf75-b2cb4ee11855")
    public static ShapedConnectorEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ConnectorEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedConnectorEnd.STEREOTYPE_NAME);
        return ShapedConnectorEnd.instantiate((ConnectorEnd)e);
    }

    /**
     * Tries to instantiate a {@link ShapedConnectorEnd} proxy from a {@link ConnectorEnd} stereotyped << Shaped_ConnectorEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ConnectorEnd
     * @return a {@link ShapedConnectorEnd} proxy or <i>null</i>.
     */
    @objid ("b8de82f9-58d8-43f6-9dfd-d700e0de5abe")
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
    @objid ("59f6f524-86cd-4aab-aab7-30ac8e821ee5")
    public static ShapedConnectorEnd safeInstantiate(final ConnectorEnd obj) throws IllegalArgumentException {
        if (ShapedConnectorEnd.canInstantiate(obj))
        	return new ShapedConnectorEnd(obj);
        else
        	throw new IllegalArgumentException("ShapedConnectorEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("778a08f9-d9de-40c8-8d4f-781c952bb4b8")
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
    @objid ("fadfbeda-7df6-4570-bfbf-1bd577b41016")
    public ConnectorEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_ConnectorEnd_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("226dcfc6-13e6-4f6a-a12e-faef30cf70a4")
    public String getShaped_ConnectorEnd_shape() {
        return this.elt.getTagValue(ShapedConnectorEnd.MdaTypes.SHAPED_CONNECTOREND_SHAPE_TAGTYPE_ELT);
    }

    @objid ("b3e0e823-74d8-49f8-9624-f039c26e2bdf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_ConnectorEnd_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("71bc2bbf-437e-4bad-afd6-27491dfeacf2")
    public void setShaped_ConnectorEnd_shape(final String value) {
        this.elt.putTagValue(ShapedConnectorEnd.MdaTypes.SHAPED_CONNECTOREND_SHAPE_TAGTYPE_ELT, value);
    }

    @objid ("f1421b70-49fa-49c2-b466-575d2f5b954f")
    protected ShapedConnectorEnd(final ConnectorEnd elt) {
        this.elt = elt;
    }

    @objid ("423c6cef-d75e-4070-973e-0ef047dd577b")
    public static final class MdaTypes {
        @objid ("9fea431e-64e9-4a92-9558-4fb724152801")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd789edd-4bf4-4f32-a58d-c3e1519b8ea7")
        public static TagType SHAPED_CONNECTOREND_SHAPE_TAGTYPE_ELT;

        @objid ("bd2cfe9b-5e07-45c9-86ef-5ac8b6958008")
        private static Stereotype MDAASSOCDEP;

        @objid ("16063767-3b56-4d83-89a0-22afba801a4d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5781adbf-c196-4834-b85c-517c42b98bf7")
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
