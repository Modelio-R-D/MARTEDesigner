/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << InterruptResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d54d6a5e-07c2-47f6-8ada-ef2e471cad84")
public class InterruptResourceAttribute extends SwConcurrentResourceAttribute {
    @objid ("6861097d-1589-434f-8725-90fcbfd76dc0")
    public static final String STEREOTYPE_NAME = "InterruptResource_Attribute";

    @objid ("478fbd3c-e780-4634-ad37-34013b65a5a9")
    public static final String INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE = "InterruptResource_Attribute_isMaskable";

    @objid ("0efb21d0-9afa-41bf-9e9a-8c8b3aee0826")
    public static final String INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE = "InterruptResource_Attribute_kind";

    @objid ("5e83ec11-c802-4c09-acb1-4907f76732b5")
    public static final String INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE = "InterruptResource_Attribute_maskElements";

    @objid ("4ef1f59e-0cda-4ec7-b485-7ac0f19c057a")
    public static final String INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Attribute_routineConnectServices";

    @objid ("9d874dcc-3d70-40e9-a901-ae451f98c5ac")
    public static final String INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Attribute_routineDisconnectServices";

    @objid ("eb268907-f4db-43b5-b7d9-8b53390337c5")
    public static final String INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE = "InterruptResource_Attribute_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << InterruptResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("648f61de-1ff9-4043-bd8e-0d36410a531f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << InterruptResource_Attribute >> then instantiate a {@link InterruptResourceAttribute} proxy.
     * 
     * @return a {@link InterruptResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("ab764aa7-68ee-4031-b0ac-690cd1912706")
    public static InterruptResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAttribute.STEREOTYPE_NAME);
        return InterruptResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAttribute} proxy from a {@link Attribute} stereotyped << InterruptResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link InterruptResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("efd0e479-adf9-4dba-9e11-21dd1cf50821")
    public static InterruptResourceAttribute instantiate(final Attribute obj) {
        return InterruptResourceAttribute.canInstantiate(obj) ? new InterruptResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAttribute} proxy from a {@link Attribute} stereotyped << InterruptResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link InterruptResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cfe8734f-d64b-4de2-9ebd-6ca42d70c311")
    public static InterruptResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (InterruptResourceAttribute.canInstantiate(obj))
        	return new InterruptResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d7fa6c1-7325-41bc-9fdf-bc9336af2f71")
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
        InterruptResourceAttribute other = (InterruptResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("3bade746-8a94-47d4-a745-2a2e49c47b7d")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Attribute_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b5e494b0-a91e-420e-b269-b14c9a87cee8")
    public String getInterruptResource_Attribute_kind() {
        return this.elt.getTagValue(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Attribute_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d5c96698-b675-4d1b-ab98-a81c27689216")
    public List<String> getInterruptResource_Attribute_maskElements() {
        return this.elt.getTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Attribute_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("efa50068-ea49-4709-9f76-bac7902344b7")
    public List<String> getInterruptResource_Attribute_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Attribute_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("89682ada-5deb-4a20-bfbf-22ad774ffdba")
    public List<String> getInterruptResource_Attribute_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Attribute_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3f886334-8bbc-4b4a-af03-187e839d1396")
    public List<String> getInterruptResource_Attribute_vectorElements() {
        return this.elt.getTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @objid ("55b33a24-1d4a-42aa-90b2-9f7744c52726")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Attribute_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f17f1de2-fb0d-4ee3-86e2-171aa272b841")
    public boolean isInterruptResource_Attribute_isMaskable() {
        return this.elt.isTagged(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Attribute_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("481f372d-256f-453d-8556-3b6d03ee591c")
    public void setInterruptResource_Attribute_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Attribute_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d714cdf1-ee1d-4774-91e9-fc3c4d755807")
    public void setInterruptResource_Attribute_kind(final String value) {
        this.elt.putTagValue(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Attribute_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f19d813-2937-45de-a54d-1dc47ccf9732")
    public void setInterruptResource_Attribute_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Attribute_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6caae73-5773-4a83-a01e-029bfbdcc9f4")
    public void setInterruptResource_Attribute_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Attribute_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b3e5ba1-f221-4cb6-aac3-6751b54d4c3b")
    public void setInterruptResource_Attribute_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Attribute_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1986f863-114d-4a2a-8ddb-09997bf1b984")
    public void setInterruptResource_Attribute_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    @objid ("15c1e3fe-8b01-4878-93bb-655198f0275b")
    protected InterruptResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("a9813ed3-958e-4929-861a-29c13a383f38")
    public static final class MdaTypes {
        @objid ("73d17505-87ee-47ca-8800-6e66edb2319a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9c56e1a6-57a8-400a-a014-9acd0ffd8f9f")
        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE_ELT;

        @objid ("c976611d-86b0-4d39-8d30-301a16bebf09")
        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT;

        @objid ("dd979215-0105-437f-947d-d6d43d12431d")
        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE_ELT;

        @objid ("6fa30467-d796-4a5a-aad5-feffe95db2a1")
        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT;

        @objid ("4824acae-364f-4d1d-b368-ae31e7fe1ad7")
        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        @objid ("ebaf51cc-7f9f-41cc-a9e3-0bdcf924d58b")
        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        @objid ("8d2bdb8e-77c8-4ed4-8d3d-56840610ccc9")
        private static Stereotype MDAASSOCDEP;

        @objid ("7c0135b9-ae0f-4f20-b540-aa16a9653611")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1863ad4a-d2e5-4995-9451-fd4e1c49641b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01c94b7e-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b85-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b8c-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b93-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b9a-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94ba1-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadd3-0ccf-11df-8525-001302895b2b");
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
