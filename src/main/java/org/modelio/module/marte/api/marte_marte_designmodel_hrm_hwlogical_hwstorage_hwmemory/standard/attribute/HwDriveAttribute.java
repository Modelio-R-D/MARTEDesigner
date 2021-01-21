/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("5f39b962-f573-4e37-bd15-b558ddfd7ace")
    public static final String STEREOTYPE_NAME = "HwDrive_Attribute";

    @objid ("be3fda46-1da1-4faf-ad53-05184b8f27df")
    public static final String HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE = "HwDrive_Attribute_buffer";

    @objid ("a433c803-42e6-4277-aabf-d908d1dec720")
    public static final String HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE = "HwDrive_Attribute_sectorSize";

    /**
     * Tells whether a {@link HwDriveAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwDrive_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1be29792-a75a-41c7-add4-cd2772cf1bf3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwDrive_Attribute >> then instantiate a {@link HwDriveAttribute} proxy.
     * 
     * @return a {@link HwDriveAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("721f35ef-a3b9-424b-bfaa-802f138a6ff0")
    public static HwDriveAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDriveAttribute.STEREOTYPE_NAME);
        return HwDriveAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwDriveAttribute} proxy from a {@link Attribute} stereotyped << HwDrive_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwDriveAttribute} proxy or <i>null</i>.
     */
    @objid ("2b526829-904f-4319-baa4-9b27d1900350")
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
    @objid ("44cb2abc-e1a1-480b-ac1d-f202e5fef3c8")
    public static HwDriveAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwDriveAttribute.canInstantiate(obj))
        	return new HwDriveAttribute(obj);
        else
        	throw new IllegalArgumentException("HwDriveAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c415b02-c2a1-4f2a-9ca4-9c75cf554c4c")
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
    @objid ("c286d4c9-74d5-4d5c-befd-321259e6cb41")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwDrive_Attribute_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7908ed0a-dd0e-4eea-8189-84987a9a484e")
    public String getHwDrive_Attribute_buffer() {
        return this.elt.getTagValue(HwDriveAttribute.MdaTypes.HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDrive_Attribute_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0dd96397-cc97-4b77-8d1a-34abcc9c2d39")
    public String getHwDrive_Attribute_sectorSize() {
        return this.elt.getTagValue(HwDriveAttribute.MdaTypes.HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE_ELT);
    }

    @objid ("b2984de3-21cb-4a74-a944-55756d1cbc89")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDrive_Attribute_buffer'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06625a0c-0aa5-45ad-a528-48cebf2c7515")
    public void setHwDrive_Attribute_buffer(final String value) {
        this.elt.putTagValue(HwDriveAttribute.MdaTypes.HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDrive_Attribute_sectorSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22b91165-dbfa-4824-af9c-f132ca1d9073")
    public void setHwDrive_Attribute_sectorSize(final String value) {
        this.elt.putTagValue(HwDriveAttribute.MdaTypes.HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE_ELT, value);
    }

    @objid ("03f96877-518e-41e5-96c5-b597a7f356d0")
    protected HwDriveAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("7ba900df-1b16-466e-bb0a-59ef0b98bb37")
    public static final class MdaTypes {
        @objid ("328e54be-d558-4213-9027-4ed4a8adefc7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("27ccf850-d1d0-460e-abba-c49c9af382bb")
        public static TagType HWDRIVE_ATTRIBUTE_SECTORSIZE_TAGTYPE_ELT;

        @objid ("97e3080d-ec21-42ff-b4cd-6c87b8ada6b0")
        public static TagType HWDRIVE_ATTRIBUTE_BUFFER_TAGTYPE_ELT;

        @objid ("d52b0a8e-47e3-4547-996f-1cd998380cbf")
        private static Stereotype MDAASSOCDEP;

        @objid ("bbf7382e-f108-4277-81c3-7b18e1c8cd57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3608dc9c-1395-4d56-9ff0-fa6a9284de0a")
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
