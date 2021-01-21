/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.SchedulableResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << GaCommChannel_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dca8f6ae-fcbd-48c9-b07d-a467b0817ba2")
public class GaCommChannelAttribute extends SchedulableResourceAttribute {
    @objid ("72cbe2dc-e17a-4946-b59d-3610ba996cef")
    public static final String STEREOTYPE_NAME = "GaCommChannel_Attribute";

    @objid ("01715cd6-99bc-4cf2-a96d-ed19319a8c21")
    public static final String GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE = "GaCommChannel_Attribute_packetSize";

    @objid ("f48da763-8ee4-4efc-bcb3-1681911625b7")
    public static final String GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE = "GaCommChannel_Attribute_utilization";

    /**
     * Tells whether a {@link GaCommChannelAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << GaCommChannel_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b87685ca-f7e8-4482-ad94-e23184261c66")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << GaCommChannel_Attribute >> then instantiate a {@link GaCommChannelAttribute} proxy.
     * 
     * @return a {@link GaCommChannelAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("9a42a8a9-8256-4d95-9b51-a6ee32edfb20")
    public static GaCommChannelAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAttribute.STEREOTYPE_NAME);
        return GaCommChannelAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelAttribute} proxy from a {@link Attribute} stereotyped << GaCommChannel_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link GaCommChannelAttribute} proxy or <i>null</i>.
     */
    @objid ("86a610e7-ffe1-411f-b797-00f66ee20b8f")
    public static GaCommChannelAttribute instantiate(final Attribute obj) {
        return GaCommChannelAttribute.canInstantiate(obj) ? new GaCommChannelAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelAttribute} proxy from a {@link Attribute} stereotyped << GaCommChannel_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link GaCommChannelAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2ad42276-ebf1-41ba-aa8f-c5b73f79a231")
    public static GaCommChannelAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (GaCommChannelAttribute.canInstantiate(obj))
        	return new GaCommChannelAttribute(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a4b95fce-014f-439d-8a89-cc1d2d4b532a")
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
        GaCommChannelAttribute other = (GaCommChannelAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("e4c2e077-b22b-4b41-815c-d2d630c0789d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Attribute_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6556211b-cd17-4924-9d18-c54dc0b23bab")
    public String getGaCommChannel_Attribute_packetSize() {
        return this.elt.getTagValue(GaCommChannelAttribute.MdaTypes.GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Attribute_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("726e82bc-8dcc-4597-9f3f-b64b3e60a674")
    public List<String> getGaCommChannel_Attribute_utilization() {
        return this.elt.getTagValues(GaCommChannelAttribute.MdaTypes.GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("a75d41e9-fefd-4090-8de7-e835cd70255b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Attribute_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2fb941d-2651-4e9b-becc-e31e45e78c51")
    public void setGaCommChannel_Attribute_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelAttribute.MdaTypes.GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Attribute_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55c3bda7-df9c-4dd5-915c-ab9c6bda6d0e")
    public void setGaCommChannel_Attribute_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelAttribute.MdaTypes.GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT, values);
    }

    @objid ("b3aed4e1-e437-4cbd-9217-e1d17280f9fc")
    protected GaCommChannelAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("e94df398-82d6-4230-86e5-3f9a2899a880")
    public static final class MdaTypes {
        @objid ("d0b0ea7d-4093-493b-820c-2b430e054354")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e1ce2367-2bb3-4ad9-9e73-c0da0c4f0007")
        public static TagType GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT;

        @objid ("15fba81c-2389-4fb9-bc69-4e6f5ed1f9bc")
        public static TagType GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT;

        @objid ("f4c0b972-bf15-4826-b446-ff1837d89f38")
        private static Stereotype MDAASSOCDEP;

        @objid ("9328d83a-34bd-48b4-bf6b-bbdbcd6e3362")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c68df1e-3f18-4957-8efc-2d9f71503ce7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "036ce3ea-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4633-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f463a-0ccf-11df-8525-001302895b2b");
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
