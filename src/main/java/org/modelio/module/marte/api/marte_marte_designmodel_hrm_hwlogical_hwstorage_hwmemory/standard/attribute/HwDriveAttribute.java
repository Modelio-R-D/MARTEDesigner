/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwDrive_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b7d13a97-f3a3-46cd-ac89-5dc597b19ad5")
public class HwDriveAttribute extends HwMemoryAttribute {
    @objid ("55a0eec5-ae7e-4547-b9eb-3c989bbdb880")
    public static final String STEREOTYPE_NAME = "HwDrive_Attribute";

    @objid ("1b8b675b-5bab-4c30-9af8-25b10d2bb20d")
    public static final String HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE = "HwDrive_Attribute_buffer";

    @objid ("9f138f88-947f-49cf-b160-3ab720e591a9")
    public static final String HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE = "HwDrive_Attribute_sectorSize";

    /**
     * Tells whether a {@link HwDriveAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwDrive_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("41bd9926-a1b0-4f0b-928b-ed8321655b26")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwDrive_Attribute >> then instantiate a {@link HwDriveAttribute} proxy.
     * 
     * @return a {@link HwDriveAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("da8afbd7-f161-4659-9d3d-a5dec71881e8")
    public static HwDriveAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAttribute.STEREOTYPE_NAME);
        return HwDriveAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveAttribute} proxy from a {@link Attribute} stereotyped << HwDrive_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwDriveAttribute} proxy or <i>null</i>.
     */
    @objid ("95429153-26a9-44b1-9b19-a19605e90017")
    public static HwDriveAttribute instantiate(final Attribute obj) {
        return HwDriveAttribute.canInstantiate(obj) ? new HwDriveAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDriveAttribute} proxy from a {@link Attribute} stereotyped << HwDrive_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwDriveAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("26357091-e131-4d1d-ae8e-a55167967fae")
    public static HwDriveAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwDriveAttribute.canInstantiate(obj))
        	return new HwDriveAttribute(obj);
        else
        	throw new IllegalArgumentException("HwDriveAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b55737b9-3550-45dd-ae9d-f31c2ee4bf43")
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
        HwDriveAttribute other = (HwDriveAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("e762eb02-3984-4286-9177-415d4239154c")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Attribute_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76ce9913-60b1-461c-adc7-8517872f90e1")
    public String getHwDrive_Attribute_buffer() {
        return this.elt.getTagValue(HwDriveAttribute.MdaTypes.HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Attribute_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d59856c6-a5db-41e2-840f-6c5498e0839e")
    public String getHwDrive_Attribute_sectorSize() {
        return this.elt.getTagValue(HwDriveAttribute.MdaTypes.HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("0302bae3-9e66-4304-993b-a656b11afc1e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Attribute_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("402b90c1-22b1-4f81-8ba0-477d85676059")
    public void setHwDrive_Attribute_buffer(final String value) {
        this.elt.putTagValue(HwDriveAttribute.MdaTypes.HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Attribute_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9eb20d10-317c-4405-a5c8-893f97907dc1")
    public void setHwDrive_Attribute_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveAttribute.MdaTypes.HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("518d48db-25ea-4358-8a2d-0a84030e7e90")
    protected HwDriveAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("7ba900df-1b16-466e-bb0a-59ef0b98bb37")
    public static final class MdaTypes {
        @objid ("6eaefade-f169-443e-a9d2-cfaf2fdfe191")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4faf2595-e633-48a1-b7af-05df978ad8d3")
        public static TagType HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE_ELT;

        @objid ("313bc1ed-3625-4535-87c2-407834ed81e6")
        public static TagType HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE_ELT;

        @objid ("12384862-846c-442f-9831-c6244a871715")
        private static Stereotype MDAASSOCDEP;

        @objid ("d9fb5a44-5760-4321-b980-4fbcdb25cb50")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e88e0c8c-682f-459d-b4ee-aeae772c6b71")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "016eb352-0ccf-11df-8525-001302895b2b");
            HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb359-0ccf-11df-8525-001302895b2b");
            HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "016eb360-0ccf-11df-8525-001302895b2b");
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
