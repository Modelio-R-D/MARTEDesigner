/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class GaCommChannelAttribute extends SchedulableResourceAttribute {
    public static final String STEREOTYPE_NAME = "GaCommChannel_Attribute";

    public static final String GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE = "GaCommChannel_Attribute_packetSize";

    public static final String GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE = "GaCommChannel_Attribute_utilization";

    /**
     * Tells whether a {@link GaCommChannelAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << GaCommChannel_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << GaCommChannel_Attribute >> then instantiate a {@link GaCommChannelAttribute} proxy.
     * 
     * @return a {@link GaCommChannelAttribute} proxy on the created {@link Attribute}.
     */
    public static GaCommChannelAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelAttribute.STEREOTYPE_NAME);
        return GaCommChannelAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelAttribute} proxy from a {@link Attribute} stereotyped << GaCommChannel_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link GaCommChannelAttribute} proxy or <i>null</i>.
     */
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
    public static GaCommChannelAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (GaCommChannelAttribute.canInstantiate(obj))
        	return new GaCommChannelAttribute(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Attribute_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommChannel_Attribute_packetSize() {
        return this.elt.getTagValue(GaCommChannelAttribute.MdaTypes.GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Attribute_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommChannel_Attribute_utilization() {
        return this.elt.getTagValues(GaCommChannelAttribute.MdaTypes.GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Attribute_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Attribute_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelAttribute.MdaTypes.GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Attribute_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Attribute_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelAttribute.MdaTypes.GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommChannelAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMCHANNEL_ATTRIBUTE_PACKETSIZE_TAGTYPE_ELT;

        public static TagType GACOMMCHANNEL_ATTRIBUTE_UTILIZATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
